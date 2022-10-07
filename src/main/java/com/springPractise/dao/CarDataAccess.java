package com.springPractise.dao;

import com.springPractise.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository("CarRepo")
public class CarDataAccess implements CarImpl{
    private static List<Car> carList=new ArrayList<>();

    @Override
    public String carDetails(Car car) {
        return "Car: "+car.getCarName()+" Brand: "+car.getCarBrand()+" Year: "+car.getYear();
    }

    @Override
    public boolean deleteCar(Car car) {
        carList.remove(car);
        return true;
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarByName(String carName) {
        return carList.stream().filter(car -> carName.equals(car.getYear())).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByYear(String year) {
        List<Car> cars=new ArrayList<>();
        cars.add(new Car("Mimi","sdv","ddd"));
        return cars;
    }

    @Override
    public String addCar(Car car) {
        carList.add(car);
        return "Car Added Successfully";
    }

}
