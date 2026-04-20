//import java.io.InterruptedIOException;


public class Task1 extends Thread{
    public void run(){
        System.out.println("Task Thread started");
        for(int i=0; i<5; i++){
            System.out.println("Task Thread is working");

        }
        System.out.println("Task Thread finished");
    }
}