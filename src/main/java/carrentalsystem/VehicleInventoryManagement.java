package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {

    private final List<Vehicle> vehicleList;

    public VehicleInventoryManagement(){
        vehicleList=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
}
