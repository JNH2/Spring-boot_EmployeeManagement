package com.dailycodedancing.employeemanagementapi.entity;

public class Employee {
    private String firstName;
    private long id;
    private String emailId;
    private String department;
    private String lastName;

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
}

