package com.springPractise.service;

import com.springPractise.dao.CarImpl;
import com.springPractise.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarImpl carDao;

    @Autowired
    public CarService( @Qualifier("CarRepo") CarImpl carDao) {
        this.carDao = carDao;
    }

    public String getDetails(String name){
        return carDao.carDetails(name);
    }

    public List<Car> findCarByName(String name){
        return carDao.getCarByName(name);
    }

    public List<Car> getCars(){
        return carDao.getAllCars();
    }

    public List<Car> findCarByYear(int year){
        return carDao.getCarsByYear(year);
    }

    public boolean deleteCar(String car){
        return carDao.deleteCar(car);
    }

    public String addCar(Car car){
        return carDao.addCar(car);
    }

}
