class Data{
    int a=10;
    Data(){
        System.out.println("We are sleeping");
    }
}

class D extends Data{
    D(){
        super();
    }
}

public class Super_demo2 {
    public static void main(String[] args){
        D d = new D();
    }
}