interface DefaultMethodDemoA{
    public void sleep();
    default void run(){
        System.out.println("I'm running...");
    }
}

class DefaultMethodDemoB implements DefaultMethodDemoA{
    public void sleep(){
        System.out.println("I'm sleeping...");
    }
}

class DefaultMethodDemo{
    public static void main(String[] args) {
        DefaultMethodDemoB b = new DefaultMethodDemoB();
        b.sleep();
        b.run();

    }
}