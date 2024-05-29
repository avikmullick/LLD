package designpatterns.factory;

public class Honda implements IVehicleFourWheeler{
    @Override
    public String getDescription() {
        return "Honda";
    }

    @Override
    public String getCompanyName() {
        return "Honda Company";
    }

    @Override
    public String getModel() {
        return "Elevate";
    }

    @Override
    public String getPrice() {
        return "5000";
    }
}
