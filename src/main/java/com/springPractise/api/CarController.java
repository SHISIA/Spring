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
    @PostMapping("/add")
    public void addCar(@RequestBody Car car){
         service.addCar(car);
    }

    @DeleteMapping("/delete")
    public void deleteCar(@RequestBody Car car){
        service.deleteCar(car);
    }

    @GetMapping("/carName/")
    public List<Car> findCarByName(@PathVariable("carName") String carName){
        return service.findCarByName(carName);
    }

    @GetMapping("/carYear/")
    public List<Car> findCarByYear(@PathVariable("year") String year){
        return service.findCarByYear(year);
    }

    @GetMapping("/allCars")
    public List<Car> getAllCars(){
        return service.getCars();
    }

    @GetMapping("/carDetails")
    public String getCarDetails(@RequestBody Car car){
        return service.getDetails(car);
    }
}
