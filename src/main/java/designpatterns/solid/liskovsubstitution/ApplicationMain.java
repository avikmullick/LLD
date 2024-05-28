package designpatterns.solid.liskovsubstitution;

import designpatterns.solid.liskovsubstitution.violatingprinciple.Bicycle;
import designpatterns.solid.liskovsubstitution.violatingprinciple.Bike;
import designpatterns.solid.liskovsubstitution.violatingprinciple.Car;
import designpatterns.solid.liskovsubstitution.violatingprinciple.IVehicle;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

    public static void main(String[] args) {

        List<IVehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        vehicleList.add(new Bike());

        //Violating Liskov Substitution Principle as null pointer is thrown.
        for(IVehicle vehicle:vehicleList){
            System.out.println(vehicle.hasEngine().toString());
        }

        List<designpatterns.solid.liskovsubstitution.IVehicle> vehicleListL=new ArrayList<>();
        vehicleListL.add(new designpatterns.solid.liskovsubstitution.Car());
        vehicleListL.add(new designpatterns.solid.liskovsubstitution.Bicycle());
        vehicleListL.add(new designpatterns.solid.liskovsubstitution.Bike());

        //Error is thrown at compile time now
        for(designpatterns.solid.liskovsubstitution.IVehicle vehicle:vehicleListL){
           // System.out.println(vehicle.hasEngine().toString());
        }

    }
}
