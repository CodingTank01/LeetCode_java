package Java.Parking_lot;

abstract class Vehicle {
    String number;
    String type;

    Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}