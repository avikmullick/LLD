package designpatterns.factory.abstractfactory;

public interface IVehicleFactory {
    IVehicle getVehicle(String vehicleByBrand);
}
