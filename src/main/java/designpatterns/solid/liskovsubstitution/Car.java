package designpatterns.solid.liskovsubstitution;

public class Car implements IVehicleWithEngine{
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public Boolean hasEngine() {
        return true;
    }
}
