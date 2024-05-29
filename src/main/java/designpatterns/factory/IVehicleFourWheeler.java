package designpatterns.factory;

import designpatterns.factory.abstractfactory.IVehicle;
import designpatterns.factory.abstractfactory.IVehicleFactory;

public interface IVehicleFourWheeler extends IVehicle {
    String getDescription();

    String getCompanyName();

    String getModel();

    String getPrice();
}
