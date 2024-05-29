package designpatterns.factory;

import designpatterns.factory.abstractfactory.IVehicle;
import designpatterns.factory.abstractfactory.IVehicleFactory;

public class VehicleFourWheelerFactory implements IVehicleFactory {

    public IVehicle getVehicle(String carByBrand){
        IVehicleFourWheeler vehicleFourWheeler = null;
        switch(carByBrand){
            case "BMW": vehicleFourWheeler=new BMW(); break;
            case "Honda" : vehicleFourWheeler=new Honda(); break;
        }
        return vehicleFourWheeler;
    }
}
