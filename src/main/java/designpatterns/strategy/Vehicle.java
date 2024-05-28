package designpatterns.strategy;

public abstract class  Vehicle {

    private final VehicleWheelStrategy vehicleWheelStrategy;

    Vehicle(VehicleWheelStrategy vehicleWheelStrategy){
        this.vehicleWheelStrategy=vehicleWheelStrategy;
    }

    public int noOfWheels(){
        return vehicleWheelStrategy.noOfWheels();
    }
}
