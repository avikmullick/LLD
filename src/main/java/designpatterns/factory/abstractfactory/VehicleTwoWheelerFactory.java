package designpatterns.factory.abstractfactory;

import designpatterns.factory.BMW;
import designpatterns.factory.Honda;
import designpatterns.factory.IVehicleFourWheeler;

public class VehicleTwoWheelerFactory implements IVehicleFactory {
    public IVehicle getVehicle(String bikeByBrand){
        IVehicleTwoWheeler vehicleTwoWheeler = null;
        switch(bikeByBrand){
            case "TVS": vehicleTwoWheeler=new TVS(); break;
        }
        return vehicleTwoWheeler;
    }
}
