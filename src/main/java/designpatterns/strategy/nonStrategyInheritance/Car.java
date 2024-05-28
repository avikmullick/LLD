package designpatterns.strategy.nonStrategyInheritance;

public class Car implements IVehicle {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}
