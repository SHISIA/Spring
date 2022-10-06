package com.springPractise.dao;

import com.springPractise.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository("CarRepo")
public class CarDataAccess implements CarImpl{
    private static List<Car> carList=new ArrayList<>();

//    @Override
//    public String carDetails(Car car) {
//        return "Car: "+car.getCarName()+" Brand: "+car.getCarBrand()+" Year: "+car.getYear();
//    }
//
//    @Override
//    public boolean deleteCar(Car car) {
//        carList.remove(car);
//        return true;
//    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public Car getCarByName(String carName) {
        return carList.stream().filter(car -> carName.equals(car.getCarName())).findAny().orElse(null);
    }

    @Override
    public List<Car> getCarsByYear(String year) {
        return carList.stream().filter(car -> year.equals(car.getYear())).collect(Collectors.toList());
    }

    @Override
    public String addCar(Car car) {
        carList.add(car);
        return "Car Added Successfully";
    }

}
