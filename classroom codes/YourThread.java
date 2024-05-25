package stud;

public class YourThread extends Thread{
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.print(e);
            }
        }
    }
}
/*
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new YourThread());
        t1.setName("kpr");
        t2.setName("tsm");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
*/