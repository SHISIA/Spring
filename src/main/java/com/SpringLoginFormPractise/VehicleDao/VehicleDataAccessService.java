package com.SpringLoginFormPractise.VehicleDao;

import com.SpringLoginFormPractise.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("Showroom")
public class VehicleDataAccessService implements Dao{

    private List<Vehicle> vehicles=new ArrayList<>();
    @Override
    public int numberOfVehicles() {
        return (int)vehicles.stream().count();
    }

    @Override
    public String vehicleNameByPlate(String vehiclePlate) {
        return vehicles.stream()
                .filter(vehicle -> vehiclePlate.equals(vehicle.getVehiPlate())).toString();
    }

    @Override
    public boolean vehicleAdded(Vehicle vehicle) {
        return vehicles.add(vehicle);
    }

    @Override
    public String vehicleSecurity(Vehicle vehicle) {
        return vehicles.stream()
                .filter(vehicle1 -> vehicle.getVehiName().equals(vehicle1.getVehiName())).toString();
    }

    @Override
    public List<Vehicle> availableVehices() {
        return vehicles;
    }
}
