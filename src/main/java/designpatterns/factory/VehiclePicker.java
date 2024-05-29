package designpatterns.factory;

import designpatterns.factory.abstractfactory.VehicleProductionFactory;

public class VehiclePicker {

    //Creational Design Pattern
    public static void main(String[] args) {
        VehicleFourWheelerFactory vehicleFourWheelerFactory=new VehicleFourWheelerFactory();

        System.out.println(vehicleFourWheelerFactory.getVehicle("BMW").getCompanyName());

        //Abstract factory

        VehicleProductionFactory vehicleProductionFactory=new VehicleProductionFactory();
        System.out.println(vehicleProductionFactory.getVehicle("two").getVehicle("TVS").getCompanyName());
    }
}
