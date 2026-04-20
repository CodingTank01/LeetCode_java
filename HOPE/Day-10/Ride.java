/* OOPs implementation */

import java.util.*;

public class Ride {
    String name;
    String pickup;
    String drop;
    List<String> stop;
    double fare;
    String status;
    
    Ride(String name, String pickup, String drop){
        this.name=name;
        this.pickup=pickup;
        this.drop=drop;
        this.stop = new ArrayList<>();
        this.fare=calculation();
        this.status="BOOKED";
    }

    Ride(String name, String pickup, String drop, List<String> stop){
        this.name=name;
        this.pickup=pickup;
        this.drop=drop;
        this.stop = stop;
        this.fare=calculation();
        this.status="BOOKED";
    }
    
    double calculation(){
        return 50 + (stop.size()*50);
    }
    
    void showdetails(){
        System.out.print("\n-----------Customer Details-----------");
        System.out.print("\nCustomer: " + this.name + "\nRoute: ");
        System.out.print(this.pickup);
        for(String s : this.stop){
            System.out.print("-->"+s);
        }
        System.out.print("-->"+this.drop);
        System.out.print("\nFare: "+ this.fare);
        System.out.print("\nStatus: "+ this.status);
        System.out.print("\n--------------------------------------\n");
    }
    
    void cancelride(){
        if(this.status.equals("cancelled")) System.out.print("\nAlready cancelled.");
        else if(this.status.equals("completed")) System.out.print("\nRide already completed.");
        else{
            this.status="cancelled";
            this.fare=0;
            System.out.print("\nRide succesfully cancelled");
        }
    }
    
    void completeride(){
        if(this.status.equals("cancelled")) System.out.print("\nRide was cancelled.");
        else if(this.status.equals("completed")) System.out.print("\nRide already completed.");
        else{
            this.status="completed";
            System.out.print("\nRide successfully completed");
        }
    }
    
    public static void main(String[] args){
        Ride R1 = new Ride("John", "Avadi", "OMR");
        R1.showdetails();
        List<String> stop = new ArrayList<>();
        stop.add("Vadapalani");
        stop.add("Ambattur");
        Ride R2 = new Ride("Smith", "Avadi", "Chennai Central", stop);
        R2.showdetails();
        R1.cancelride();
        R1.showdetails();
        R2.completeride();
        R2.showdetails();
        System.out.print("\n");
    }
}