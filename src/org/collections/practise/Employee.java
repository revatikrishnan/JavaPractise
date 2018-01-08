package org.collections.practise;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int empId;
    private String empName;
    private int empAge;
    private double salary;
    
    
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId; 
    }
    
    public void setEmpId(int empId) {
        this.empId=empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    
    public Employee(int empId,String empName,int empAge,double salary) {
        this.empId=empId;
        this.empName=empName;
        this.empAge=empAge;
        this.salary=salary;
    }

    

    @Override
    public int compareTo(Employee arg0) {
        return this.empName.compareTo(arg0.empName);
    }
}