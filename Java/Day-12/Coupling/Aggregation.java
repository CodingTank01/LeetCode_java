class Driver{
    String name;
    Driver(String name){//2
        this.name=name;//3
    }
    void drive(){//10
        System.out.println("Driver came.");//11
    }
}

class Car{
    Driver d;
    Car(Driver d){//5
        this.d=d;//6
    }
    void start(){//8
        d.drive();//9
        System.out.println("Car has been started.");//12
    }
}

public class Aggregation {
    public static void main(String[] args){
        Driver d = new Driver("John");//1
        Car c = new Car(d);//4
        c.start();//7
    }
}
