package parkinglot;

import java.util.List;
import java.util.Set;

public interface ParkingSpotManager {

    void add(ParkingSpot parkingSpot);

    void remove(ParkingSpot parkingSpot);

    Set<ParkingSpot> getListOfEmptyParkingSpot();

    Set<ParkingSpot> getOccupiedParkingSpot();

    default int getPriceOfParkingSpot(ParkingSpotType parkingSpotType){
        if(parkingSpotType.equals(ParkingSpotType.TWO_WHEELER)){
            return 20;
        } else if(parkingSpotType.equals(ParkingSpotType.FOUR_WHEELER)){
            return 40;
        } else {
            return 10;
        }
    }
}
