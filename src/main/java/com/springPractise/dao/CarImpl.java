package com.springPractise.dao;

import com.springPractise.model.Car;

import java.util.List;

public interface CarImpl {

     String carDetails(Car car);

    boolean deleteCar(Car car);

    List<Car> getAllCars();

    List<Car> getCarByName(String carName);

    List<Car> getCarsByYear(String year);

    String addCar(Car car);

}
