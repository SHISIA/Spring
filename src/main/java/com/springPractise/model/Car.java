package com.springPractise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final String carName;
    private final String carBrand;
    private final String year;

    public Car(@JsonProperty String carName,
               @JsonProperty String carBrand,
               @JsonProperty String year) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.year = year;

    }

    public String getCarName() {
        return carName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getYear() {
        return year;
    }

}
