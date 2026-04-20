package Java.Parking_lot;

import java.util.*;

class ParkingLot {
    List<ParkingSpot> spots = new ArrayList<>();

    ParkingLot() {
        for (int i = 1; i <= 5; i++) {
            spots.add(new ParkingSpot(i, "Car"));
        }
        for (int i = 6; i <= 10; i++) {
            spots.add(new ParkingSpot(i, "Bike"));
        }
    }

    public void parkVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied && spot.type.equals(v.getType())) {
                spot.isOccupied = true;
                System.out.println(v.number + " parked at spot " + spot.id);
                return;
            }
        }
        System.out.println("No available spot for " + v.getType());
    }

    public void removeVehicle(int spotId) {
        for (ParkingSpot spot : spots) {
            if (spot.id == spotId && spot.isOccupied) {
                spot.isOccupied = false;
                System.out.println("Spot " + spotId + " is now free");
                return;
            }
        }
        System.out.println("Invalid spot or already empty");
    }

    public void displayStatus() {
        for (ParkingSpot spot : spots) {
            System.out.println("Spot " + spot.id + " (" + spot.type + ") - " +
                    (spot.isOccupied ? "Occupied" : "Free"));
        }
    }
}