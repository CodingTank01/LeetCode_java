class Counter{
    int count=0;
    void counting(){
        count++;
    }
}


class RaceConditon {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
                for(int i=0; i<1000000; i++) c.counting();
        });
        Thread t2 = new Thread(()->{
                for(int i=0; i<1000000; i++) c.counting();
        });

        t1.start();
        t2.start();

        t1.join();//waits for t1 to finish before proceeding
        t2.join();//waits for t2 to finish before proceeding
        System.out.println("Count is: "+c.count);
    }
}
