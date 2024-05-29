package designpatterns.factory.abstractfactory;

import designpatterns.factory.VehicleFourWheelerFactory;

public class VehicleProductionFactory {

    private IVehicleFactory vehicleFactory=null;
    public IVehicleFactory getVehicle(String type){
        switch (type){
            case "two": vehicleFactory=new VehicleTwoWheelerFactory(); break;
            case "four": vehicleFactory=new VehicleFourWheelerFactory(); break;
        }
        return vehicleFactory;
    }
}
