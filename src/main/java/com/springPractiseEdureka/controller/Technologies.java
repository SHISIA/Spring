package com.springPractiseEdureka.controller;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Technologies {
    private UUID techId;
    private String  techName;

    public UUID getTechId() {
        return techId;
    }

    public void setTechId(UUID techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public void techDetails(){
        System.out.println("Technology set currently to "+getTechName()+"("+getTechId()+").");
    }
}
