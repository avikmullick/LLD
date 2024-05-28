package designpatterns.strategy;

public class Car extends Vehicle{
    public Car(VehicleWheelStrategy vehicleWheelStrategy) {
        super(vehicleWheelStrategy);
    }
}
