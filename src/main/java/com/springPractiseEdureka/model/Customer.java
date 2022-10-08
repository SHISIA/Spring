package com.springPractiseEdureka.model;

import com.springPractiseEdureka.controller.Technologies;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Customer {

    private String cusName;
    private String courseName;
    private final Technologies technologies;

    public Customer( Technologies technologies) {
        this.technologies = technologies;
    }

    public void setCustId(UUID custId) {
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
        technologies.techDetails();
        System.out.println("\nCustomer "+getCusName()+" has taken course "+getCourseName()+" of ID: "+getCustId()+" successfully.");
    }
}
