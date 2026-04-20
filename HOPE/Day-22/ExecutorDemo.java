import java.util.concurrent.*;
class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newScheduledThreadPool(2);//OS does the scheduling for you
        for(int i=0; i<10; i++){
            int task = i;
            executor.execute(()->{
            System.out.println(task+" "+Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
