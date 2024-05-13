package assn_13;

public class SleepThreadExample {
    public static void main(String[] args) {
        Thread sleepThread = new Thread(new SleepTask());
        sleepThread.start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        sleepThread.interrupt();
    }
}

class SleepTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread is going to sleep...");
            Thread.sleep(10000);
            System.out.println("Thread woke up from sleep.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping. Exit.");
        }
    }
}