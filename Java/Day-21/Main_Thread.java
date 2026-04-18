class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1 is working...");
    }
}

class Main_Thread {
    public static void main(String[] args) {
        System.out.println("Main thread work!");
        Thread1 t1 = new Thread1();
        t1.start();
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