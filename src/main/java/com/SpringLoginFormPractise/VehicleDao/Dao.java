package com.SpringLoginFormPractise.VehicleDao;

import com.SpringLoginFormPractise.Model.Vehicle;

import java.util.List;

public interface Dao {
    int numberOfVehicles();

    String vehicleNameByPlate(String vehiclePlate);

    boolean vehicleAdded(Vehicle vehicle);

    String vehicleSecurity(Vehicle vehicle);

    List<Vehicle> availableVehices();
}
