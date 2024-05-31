package parkinglot;

public class ParkingSpot {

    private int floorLocation;
    private int parkingSpotId;

    private ParkingSpotType parkingSpotType;


    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public int getFloorLocation() {
        return floorLocation;
    }

    public void setFloorLocation(int floorLocation) {
        this.floorLocation = floorLocation;
    }
}
