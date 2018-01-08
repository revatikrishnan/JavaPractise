package org.collections.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        /*
        //basic
        List<String> names=new ArrayList<String>();
        names.add("selenium");
        names.add("protractor");
        names.add("sahi pro");
        names.add("sahi pro");
        names.add("watir");
        names.add("testcomplete");
        names.add(null);
        names.add(null);
        names.add(2, "testingwhiz");
        
        for (String n : names) {
            System.out.println(n);
        }
        names.remove(0);

        names.forEach(System.out::println);*/
        
        Employee e1=new Employee(123, "Mike Ross", 21,1234567);
        Employee e2=new Employee(125, "Donna", 56, 12000);
        Employee e3=new Employee(121, "Racheal Zane", 45,23000.00);
        Employee e4=new Employee(122, "Harvey Specter", 78,50020.00);
        Employee e5=new Employee(124, "Jessica Pearson", 25,45000.65);
        Employee e6=new Employee(120, "Scotie", 34,2300);
        List<Employee> employees=Arrays.asList(new Employee[] {e1,e2,e3,e4,e5,e6});
        
        employees.forEach(e -> System.err.println("Employee Details: empId: "+e.getEmpId()+" empName: "+e.getEmpName()+" empAge: "+e.getEmpAge()+" empSalary:"+e.getSalary()));
        
        Collections.sort(employees);
        
        System.out.println("After sorting using comparable which is implemented by the Employee class");
        employees.forEach(e -> System.err.println("Employee Details: empId: "+e.getEmpId()+" empName: "+e.getEmpName()+" empAge: "+e.getEmpAge()+" empSalary:"+e.getSalary()));
        
        Collections.sort(employees,new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getEmpId(), e2.getEmpId());
            }
        });
        
        System.out.println("After sorting using comparator");
        employees.forEach(e -> System.err.println("Employee Details: empId: "+e.getEmpId()+" empName: "+e.getEmpName()+" empAge: "+e.getEmpAge()+" empSalary:"+e.getSalary()));
        
        Collections.sort(employees,(emp1,emp2) -> Integer.compare(emp1.getEmpAge(), emp2.getEmpAge()));
        
        System.out.println("After sorting using collections.sort and lambda");
        employees.forEach(e -> System.err.println("Employee Details: empId: "+e.getEmpId()+" empName: "+e.getEmpName()+" empAge: "+e.getEmpAge()+" empSalary:"+e.getSalary()));
        
        employees.sort((employee1,employee2) -> Double.compare(employee1.getSalary(), employee2.getSalary()));
        System.out.println("after sorting using sort method of its own");
        employees.forEach(e -> System.err.println("Employee Details: empId: "+e.getEmpId()+" empName: "+e.getEmpName()+" empAge: "+e.getEmpAge()+" empSalary:"+e.getSalary()));
    }

}