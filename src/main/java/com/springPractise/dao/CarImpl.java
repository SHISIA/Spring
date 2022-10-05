package com.springPractise.dao;

import com.springPractise.model.Car;

import java.util.List;

public interface CarImpl {

    default String carDetails(Car car) {
        return "Car: "+car.getCarName()+" Brand: "+car.getCarBrand()
                +"Made in: "+car.getYear() + numOfCars();
    }

    int numOfCars();

    boolean deleteCar(Car car);

    List<Car> getAllCars();

    Car getCarByName(String carName);

    List<Car> getCarsByYear(String year);

    String addCar(Car car);

}
