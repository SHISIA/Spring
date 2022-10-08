package com.springPractise.dao;

import com.springPractise.model.Car;

import java.util.List;

public interface CarImpl {

     String carDetails(String name);

    boolean deleteCar(String car);

    List<Car> getAllCars();

    List<Car> getCarByName(String carName);

    List<Car> getCarsByYear(int year);

    String addCar(Car car);

}
