class Task implements Runnable {
    public void run(){
        System.out.println("Thread 2 is running...");
    }
}

class Pending{
    public void sum(){
        System.out.println("Sum");
    }
}

class Work extends Pending implements Runnable {
    Pending p;
    public void run(){
        p = new Pending();
        p.sum();
        System.out.println("Thread 1 is running...");
    }
}

class Main_Runnable1 {
    public static void main(String[] args) {
        System.out.println("Main thread is running...");
        Work w = new Work();
        Thread t = new Thread(w);

        Task t1 = new Task();
        Thread t2 = new Thread(t1);

        //w.sum();
        t.start();

        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        t2.start();
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
    }
}
