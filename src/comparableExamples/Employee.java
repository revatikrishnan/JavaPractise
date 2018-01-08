package comparableExamples;

public class Employee implements Comparable<Employee> {

    public int getEmpid() {
        return empid;
    }

    public Employee(
            int empid, String empfname, String salary){
        super();
        this.empid = empid;
        this.empfname = empfname;
        this.salary = salary;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpfname() {
        return empfname;
    }

    public void setEmpfname(String empfname) {
        this.empfname = empfname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private int empid;
    
    private String empfname;
    
    private String salary;

    @Override
    public int compareTo(Employee o) {
        
        return this.empfname.compareTo(o.empfname);
    }
    
    
}
