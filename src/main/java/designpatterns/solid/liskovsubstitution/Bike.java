package designpatterns.solid.liskovsubstitution;

public class Bike implements IVehicleWithEngine{
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public Boolean hasEngine() {
        return true;
    }
}
