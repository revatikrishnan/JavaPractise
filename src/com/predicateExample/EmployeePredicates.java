package com.predicateExample;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale(){
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
    
    public static Predicate<Employee> isAdultFemale(){
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
    
    public static Predicate<Employee> isAgeMoreThan(Integer age){
        return p -> p.getAge() > age;
    }
    
    public static List<Employee> filteremployees(List<Employee> employees,Predicate<Employee> predicate ){
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
        
    }
    
    public static Stream<Employee> ascendingOrder(List<Employee> employees){
        return employees.stream().sorted((e1,e2) -> e1.getAge() - e2.getAge());
    }
    
    public static Stream<Employee> descendingOrder(List<Employee> employees){
        return employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed());
    }
    
    public static Employee youngestemployee(List<Employee> employees) {
        return employees.stream().min((e1,e2) -> e1.getAge().compareTo(e2.getAge())).get();
    }
    
    public static Employee eldestemployee(List<Employee> employees) {
        return employees.stream().max((e1,e2) -> e1.getAge().compareTo(e2.getAge())).get();
    }
    
    public static Employee nthyoungest(List<Employee> employees,Integer no){
        Stream<Employee> nno= employees.stream().sorted((e1,e2) -> e1.getAge() - e2.getAge()).limit(no);
        return nno.max((e1,e2) -> e1.getAge().compareTo(e2.getAge())).get();
    }
    
    public static Employee ntheldest(List<Employee> employees,Integer no){
        Stream<Employee> nno= employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).limit(no);
        return nno.min((e1,e2) -> e1.getAge().compareTo(e2.getAge())).get();
    }
}
