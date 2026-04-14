package Java.Parking_lot;
import java.util.*;

class Parking_lot_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot();

        while (true) {
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Status");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (Car/Bike): ");
                    String type = sc.next();

                    System.out.print("Enter vehicle number: ");
                    String number = sc.next();

                    Vehicle v;
                    if (type.equalsIgnoreCase("Car")) {
                        v = new Car(number);
                    } else if (type.equalsIgnoreCase("Bike")) {
                        v = new Bike(number);
                    } else {
                        System.out.println("Invalid vehicle type");
                        break;
                    }

                    lot.parkVehicle(v);
                    break;

                case 2:
                    System.out.print("Enter spot ID to remove vehicle: ");
                    int spotId = sc.nextInt();
                    lot.removeVehicle(spotId);
                    break;

                case 3:
                    lot.displayStatus();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
