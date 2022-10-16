package com.SpringLoginFormPractise.VehiService;

import com.SpringLoginFormPractise.Model.Vehicle;
import com.SpringLoginFormPractise.VehicleDao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Dao dao;

    @Autowired
    public Service(@Qualifier("Showroom") Dao dao) {
        this.dao = dao;
    }

    public List<Vehicle> getAllVehicles(){
        return dao.availableVehices();
    }

    public int numberOfVehicles(){
        return dao.numberOfVehicles();
    }

    public String plateName(String plate){
        return dao.vehicleNameByPlate(plate);
    }

    public boolean addVehicle(Vehicle vehicle){
        return dao.vehicleAdded(vehicle);
    }

    public String security(Vehicle vehicle){
        return dao.vehicleSecurity(vehicle);
    }
}