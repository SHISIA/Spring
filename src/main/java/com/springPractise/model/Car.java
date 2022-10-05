package com.springPractise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final String carName;
    private final String carBrand;
    private final String year;
    private final int numberOfCars;

    public Car(@JsonProperty String carName,
               @JsonProperty String carBrand,
               @JsonProperty String year,
               @JsonProperty int numberOfCars) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.year = year;
        this.numberOfCars = numberOfCars;
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

    public int getNumberOfCars() {
        return numberOfCars;
    }



}
