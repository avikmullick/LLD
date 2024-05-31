package parkinglot;

import java.util.List;
import java.util.Set;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager {
    Set<ParkingSpot> twoWheelerParkingSpots;

    Set<ParkingSpot> emptyParkingSpots;

    @Override
    public void add(ParkingSpot parkingSpot) {
        twoWheelerParkingSpots.add(parkingSpot);
    }

    @Override
    public void remove(ParkingSpot parkingSpot) {
        twoWheelerParkingSpots.remove(parkingSpot);
    }

    @Override
    public Set<ParkingSpot> getListOfEmptyParkingSpot() {
        return emptyParkingSpots;
    }

    @Override
    public Set<ParkingSpot> getOccupiedParkingSpot() {
        return twoWheelerParkingSpots;
    }
}
