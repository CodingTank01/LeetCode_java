class Counter2{
    int count=0;
    synchronized void counting(){
        count++;
    }
}


class RaceConditon2 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 c = new Counter2();
        Thread t1 = new Thread(()->{
                for(int i=0; i<1000000; i++) c.counting();
        });
        Thread t2 = new Thread(()->{
                for(int i=0; i<1000000; i++) c.counting();
        });

        t1.start();
        t2.start();

        t2.join();
        t2.join();
        System.out.println("Count is: "+c.count);
    }
}
