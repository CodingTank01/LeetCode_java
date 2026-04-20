//import java.io.InterruptedIOException;

class ThreadLifeCycle {
    public static void main(String[] args) {
        try{
            System.out.println("Main Thread started");
            Task1 t = new Task1();
            t.start();
            System.out.println("Task Thread state: " + t.getState());

            t.join();
            System.out.println("Task Thread state: " + t.getState());

            System.out.println("Main Thread working");
            System.out.println("Main Thread working");

            Thread.sleep(1000);

            System.out.println("Main Thread working");
            System.out.println("Main Thread working");
            System.out.println("Main Thread finished");
            
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}