package com.springPractise.api;

import com.springPractise.model.Car;
import com.springPractise.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/vehi")
@RestController
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    //working well
    @PostMapping
    public void addCar(@RequestBody Car car){
         service.addCar(car);
    }

    //works well
   @DeleteMapping(path = "{name}")
    public boolean deleteCar(@PathVariable("name") String name){
        return service.deleteCar(name);
    }

//    @GetMapping("{carName}")
//    public List<Car> findCarByName(@PathVariable String carName){
//        return service.findCarByName(carName);
//    }
//
//    @GetMapping("{year}")
//    public List<Car> findCarByYear(@PathVariable String year){
//        return service.findCarByYear(year);
//    }

    //works well
    @GetMapping
    public List<Car> getAllCars(){
        return service.getCars();
    }

    //works well
    @GetMapping("{name}")
    public String getCarDetails(@PathVariable("name") String name){
        return service.getDetails(name);
    }
}
