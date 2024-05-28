package designpatterns.strategy;

import designpatterns.strategy.nonStrategyInheritance.Bicycle;
import designpatterns.strategy.nonStrategyInheritance.Bike;
import designpatterns.strategy.nonStrategyInheritance.Car;
import designpatterns.strategy.nonStrategyInheritance.IVehicle;

public class ApplicationMain {
    public static void main(String[] args) {
        IVehicle bicycle=new Bicycle();
        System.out.println(bicycle.noOfWheels());
        System.out.println(bicycle.hasEngine());

        IVehicle car=new Car();
        System.out.println(car.noOfWheels());
        System.out.println(car.hasEngine());

        IVehicle motorBike=new Bike();
        System.out.println(motorBike.noOfWheels());
        System.out.println(motorBike.hasEngine());

        //Strategy Pattern
        //Avoid duplicateCode and redundantCode

        VehicleWheelStrategy twoWheeler=new TwoWheeler();
        VehicleWheelStrategy fourWheeler=new FourWheeler();
        Vehicle bicycleS=new designpatterns.strategy.Bicycle(twoWheeler);
        System.out.println(bicycleS.noOfWheels());

        Vehicle carS=new designpatterns.strategy.Car(fourWheeler);
        System.out.println(carS.noOfWheels());

        Vehicle motorBikeS=new designpatterns.strategy.Bike(twoWheeler);
        System.out.println(motorBikeS.noOfWheels());
    }
}
