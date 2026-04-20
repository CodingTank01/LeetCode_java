//import java.io.InterruptedIOException;

class ThreadLifeCycle2 {
    public static void main(String[] args) {
            System.out.println("Main Thread started");
            Task1 t = new Task1();
            t.start();

            t.setPriority(10);// Priority set to 10 to OS schduler(varies based on OS) will give more preference to this thread

            Thread.yield();//forces other threads to execute and pauses the current thread until then

            System.out.println("Main Thread working");
            System.out.println("Main Thread working");
            System.out.println("Main Thread finished");
    }
}