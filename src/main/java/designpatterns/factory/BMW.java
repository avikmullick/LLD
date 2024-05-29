package designpatterns.factory;

public class BMW implements IVehicleFourWheeler{
    @Override
    public String getDescription() {
        return "BMW";
    }

    @Override
    public String getCompanyName() {
        return "BMW Company";
    }

    @Override
    public String getModel() {
        return "A01";
    }

    @Override
    public String getPrice() {
        return "10000";
    }
}
