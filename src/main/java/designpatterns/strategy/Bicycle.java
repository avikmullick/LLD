package designpatterns.strategy;

public class Bicycle extends Vehicle{
    public Bicycle(VehicleWheelStrategy vehicleWheelStrategy) {
        super(vehicleWheelStrategy);
    }
}
