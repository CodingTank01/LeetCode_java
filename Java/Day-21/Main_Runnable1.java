class Work implements Runnable {
    public void run(){
        System.out.println("Thread 1 is running...");
    }
    public void run(int a){
        System.out.println("Thread "+a+" is running...");
    }
}

class Main_Runnable1 {
    public static void main(String[] args) {
        System.out.println("Main thread is running...");
        Work w = new Work();
        Thread t = new Thread(w);
        t.start();

        //t.run(9);

        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
        System.out.println("Main thread is running...");
    }
}
