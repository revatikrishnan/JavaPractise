package com.predicateExample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestEmployeePredicates {

    public static void main(String[] args) {
            Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
            Employee e2 = new Employee(2,13,"F","Martina","Hengis");
            Employee e3 = new Employee(3,43,"M","Ricky","Martin");
            Employee e4 = new Employee(4,26,"M","Jon","Lowman");
            Employee e5 = new Employee(5,19,"F","Cristine","Maria");
            Employee e6 = new Employee(6,15,"M","David","Feezor");
            Employee e7 = new Employee(7,68,"F","Melissa","Roy");
            Employee e8 = new Employee(8,79,"M","Alex","Gussin");
            Employee e9 = new Employee(9,15,"F","Neetu","Singh");
            Employee e10 = new Employee(10,45,"M","Naveen","Jain");
            
            List<Employee> employees = new ArrayList<Employee>();
            employees.addAll(Arrays.asList(new Employee[] {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
            
            List<Employee> femaleEmp=EmployeePredicates.filteremployees(employees, EmployeePredicates.isAdultFemale());
            System.out.println("Adult Female employees");
            System.out.println("----------------");
            femaleEmp.forEach(emp->System.out.println(emp));
            
            List<Employee> maleEmp=EmployeePredicates.filteremployees(employees, EmployeePredicates.isAdultMale());
            System.out.println("n Adult Male employees");
            System.out.println("   ----------------");
            maleEmp.forEach(System.out::println);
            
            List<Employee> moreThan35=EmployeePredicates.filteremployees(employees, EmployeePredicates.isAgeMoreThan(35));
            System.out.println("n Employees more than 35");
            System.out.println("   ----------------");
            moreThan35.forEach(emp->{
                System.out.println(emp);
            });
            
            //Employees other than above collection of "isAgeMoreThan(35)" can be get using negate()
            List<Employee> notmoreThan35=EmployeePredicates.filteremployees(employees, EmployeePredicates.isAgeMoreThan(35).negate());
            System.out.println("n Employees less than 35");
            System.out.println("   ----------------");
            notmoreThan35.forEach(emp->System.out.println(emp));
            
            System.out.println("n Employees in ascending order of age");
            System.out.println("   ----------------");
            Stream<Employee> acending=EmployeePredicates.ascendingOrder(employees);
            acending.forEach(System.out::println);
            
            System.out.println("n Employees in descending order of age");
            System.out.println("   ----------------");
            Stream<Employee> descending=EmployeePredicates.descendingOrder(employees);
            descending.forEach(System.out::println);
            
            
            System.out.println("n Youngest employee");
            System.out.println("   ----------------");
            Employee youngest=EmployeePredicates.youngestemployee(employees);
            
            System.out.println(youngest);
            
            System.out.println("n Eldest employee");
            System.out.println("   ----------------");
            Employee eldest=EmployeePredicates.eldestemployee(employees);
            
            System.out.println(eldest);
            
            System.out.println("n nth youngest employee");
            System.out.println("   ----------------");
            Employee nthyoungest=EmployeePredicates.nthyoungest(employees, 4);
            
            System.out.println(nthyoungest);
            
            System.out.println("n nth eldest employee");
            System.out.println("   ----------------");
            Employee ntheldest=EmployeePredicates.ntheldest(employees, 2);
            
            System.out.println(ntheldest);
            
    }

}