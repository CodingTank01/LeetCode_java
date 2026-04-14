package Java.Parking_lot;

class ParkingSpot {
    int id;
    String type;
    boolean isOccupied;

    ParkingSpot(int id, String type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }
}