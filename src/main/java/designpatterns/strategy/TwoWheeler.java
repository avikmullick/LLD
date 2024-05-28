package designpatterns.strategy;

public class TwoWheeler implements VehicleWheelStrategy {
    @Override
    public int noOfWheels() {
        return 2;
    }
}
