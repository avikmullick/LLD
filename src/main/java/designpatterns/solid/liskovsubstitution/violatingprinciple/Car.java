package designpatterns.solid.liskovsubstitution.violatingprinciple;

public class Car implements IVehicle {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public Boolean hasEngine() {
        return true;
    }
}
