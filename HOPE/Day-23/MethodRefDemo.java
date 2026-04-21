class Hello{
    public static void eat(){
        System.out.println("Eating...");
    }
}

class MethodRefDemo {
    public static void main(String[] args) {
        //Hello obj = new Hello();
        //obj.eat();
        
        Hello.eat();
        Runnable r = Hello::eat;
        r.run();

    }    
}
