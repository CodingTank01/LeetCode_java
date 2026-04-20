import java.util.concurrent.*;
class ExecutorDemo2 {
    public static void main(String[] args) {
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        for(int i=0; i<10; i++){
            int task = i;
            executor2.execute(()->{
            System.out.println(task+" "+Thread.currentThread().getName());
            });
        }

        executor2.shutdown();
    }
}
