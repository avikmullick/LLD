package designpatterns.factory.abstractfactory;

public class TVS implements IVehicleTwoWheeler{
    @Override
    public String getDescription() {
        return "TVS";
    }

    @Override
    public String getCompanyName() {
        return "TVS Company";
    }

    @Override
    public String getModel() {
        return "Razer";
    }

    @Override
    public String getPrice() {
        return "100";
    }
}
