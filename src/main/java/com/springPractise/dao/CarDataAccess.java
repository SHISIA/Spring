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
    public String carDetails(String name) {
      Car found= carList.stream().filter(car -> name.equals(car.getCarName())).findFirst().orElse(null);
        return "Car: "+found.getCarName()+" Brand: "+found.getCarBrand()+" Year: "+found.getYear();
    }

    @Override
    public boolean deleteCar(String  car) {
        carList.remove(carList.stream().filter(car1 -> car.equals(car1.getCarName())).findFirst().orElse(null));
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
