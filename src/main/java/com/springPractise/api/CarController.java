package com.springPractise.api;

import com.springPractise.model.Car;
import com.springPractise.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public int numOfCars(){
        return service.numberOfCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car){
         service.addCar(car);
    }

    @DeleteMapping
    public void deleteCar(Car car){
        service.deleteCar(car);
    }

    @GetMapping(path = "{name}")
    public Car findCarByName(@PathVariable("name") String name){
        return service.findCarByName(name);
    }

    @GetMapping(path = "{year}")
    public List<Car> findCarByYear(@PathVariable("year") String year){
        return service.findCarByYear(year);
    }

    @GetMapping
    public List<Car> getAllCars(){
        return service.getAllCars();
    }

    @GetMapping
    public String getCarDetails(@RequestBody Car car){
        return service.getCarDetails(car);
    }
}
