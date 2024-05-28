package designpatterns.strategy;

public class Bike extends Vehicle{
    public Bike(VehicleWheelStrategy vehicleWheelStrategy) {
        super(vehicleWheelStrategy);
    }
}
