package designpatterns.solid.liskovsubstitution;

public class Bicycle implements IVehicleWithoutEngine{
    @Override
    public int noOfWheels() {
        return 2;
    }
}