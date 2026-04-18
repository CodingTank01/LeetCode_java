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
class Work2 implements Runnable {
    Runnable r;

    void Work(Runnable r){
        this.r = r;
    }

    public void run(){
        System.out.println("Thread 3 is running...");
    }
}
class Main_Runnable1 {
    public static void main(String[] args) {
        System.out.println("Main thread is running...");
        Work w = new Work();
        Thread t = new Thread(w);

        Work2 w2 = new Work2();
        Thread t3 = new Thread(w2);

        Task t1 = new Task();
        Thread t2 = new Thread(t1);

        //w.sum();
        
        t.start();
        t3.start();

        //t2.start();

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
