package designpatterns.solid.liskovsubstitution.violatingprinciple;

public class Bicycle implements IVehicle {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public Boolean hasEngine() {
        return null;
    }
}
