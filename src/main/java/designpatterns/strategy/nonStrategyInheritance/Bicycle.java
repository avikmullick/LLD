package designpatterns.strategy.nonStrategyInheritance;

public class Bicycle implements IVehicle {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}
