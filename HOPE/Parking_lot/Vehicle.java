import java.io.Serializable;
abstract class Vehicle implements Serializable {
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