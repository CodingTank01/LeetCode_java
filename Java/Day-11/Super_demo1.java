class Data{
    int a = 10;
}

class D extends Data{
    void display(){
        System.out.println(a);
    }
}

public class Super_demo1 {
    public static void main(String[] args){
        D d = new D();
        d.display();
    }
}