package com.Spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    //@JsonProperty for rest api to reach
    public Person(@JsonProperty UUID id,
                  @JsonProperty String name){
        this.id = id;
        this.name = name;
    }
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
