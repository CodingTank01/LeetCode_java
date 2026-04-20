import java.io.Serializable;
class ParkingSpot implements Serializable {
    int id;
    String type;
    boolean isOccupied;

    ParkingSpot(int id, String type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }
}