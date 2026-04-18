class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread1 is working on run1...");
    }
    public void run(int a) {
        System.out.println("Thread1 is working on run2...");
    }
    public void run(int a, int b) {
        System.out.println("Thread1 is working on run3...");
    }
    public void sum(){
        System.out.println("Thread1 is working on sum...");
    }
}

class Main_Thread3 {
    public static void main(String[] args) {
        System.out.println("Main thread work!");
        Thread t1 = new Thread3();// A Thread object is created referening to Thread class and not Thread3
        t1.start();// Thread is created and started. The thread will execute the run() method according to cpu scheduling

        t1.run();//Works because run() method is present in Thread class.
        //t1.sum(); This method is not present in Thread class. So it throws compile time error. We cannot call sum method using Thread class reference variable.
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
        System.out.println("Main thread work!");
    }
}
