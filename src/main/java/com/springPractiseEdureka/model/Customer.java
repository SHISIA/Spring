package com.springPractiseEdureka.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Customer {

    private UUID custId;
    private String cusName;
    private String courseName;


    public void setCustId(UUID custId) {
        this.custId = custId;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public UUID getCustId() {
        return UUID. randomUUID();
    }

    public String getCusName() {
        return cusName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void display() {
        System.out.println("Customer "+getCusName()+" has taken course "+getCourseName()+" of ID: "+getCustId()+" successfully.");
    }
}
