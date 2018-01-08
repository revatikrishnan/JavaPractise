package com.streamExample;



public class Person
{
    public Person(Integer id, String fname, String lname) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
 
    private Integer id;
    private String fname;
    private String lname;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getFname() {
        return fname;
    }
 
    public void setFname(String fname) {
        this.fname = fname;
    }
 
    public String getLname() {
        return lname;
    }
 
    public void setLname(String lname) {
        this.lname = lname;
    }
 
    @Override
    public String toString() {
        return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
    }


    
}