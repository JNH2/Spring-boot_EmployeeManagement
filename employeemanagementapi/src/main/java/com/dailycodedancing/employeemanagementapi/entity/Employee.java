package com.dailycodedancing.employeemanagementapi.entity;

public class Employee {
    private String firstName;
    private long id;
    private String emailId;
    private String department;
    private String lastName;
    public Employee() {
    }
    public Employee(String firstName, String lastName, long id, String emailId, String department){
        this.firstName = firstName;
        this.id = id;
        this.emailId = emailId;
        this.department = department;
        this.lastName = lastName;
    }

    public long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmailId(){
        return emailId;
    }
    public String getDepartment(){
        return department;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;   
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}

