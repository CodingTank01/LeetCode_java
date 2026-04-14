class Engine{
    void on(){
        System.out.println("Engine has been turned on.");
    }

}

class Car{
    Engine e;
    Car(){
        e = new Engine();
    }
    void start(){
        e.on();
        System.out.println("The car has been started.");
    }
}

public class Composition {
    public static void main(String[] args){
        Car Audi = new Car();
        Audi.start();
    }
}
