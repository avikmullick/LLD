package designpatterns.strategy;

public class FourWheeler implements VehicleWheelStrategy{
    @Override
    public int noOfWheels() {
        return 4;
    }
}
