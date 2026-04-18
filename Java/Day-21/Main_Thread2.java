class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread1 is working on run1...");
    }
    public void run(int a) {
        System.out.println("Thread1 is working on run2...");
    }
    public void run(int a, int b) {
        System.out.println("Thread1 is working on run3...");
    }
}

class Main_Thread2 {
    public static void main(String[] args) {
        System.out.println("Main thread work!");
        Thread2 t1 = new Thread2();// Thread object is created. No thread is created yet.
        t1.start();// Thread is created and started. The thread will execute the run() method according to cpu scheduling
        t1.run(5);// The thread abondons run1 and executes run2 (we are forcing cpu to execute run2 method)
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        t1.run(5,6);// The thread abondons run1 and and executes run3 (we are forcing cpu to execute run3 method)
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
    }    
}
