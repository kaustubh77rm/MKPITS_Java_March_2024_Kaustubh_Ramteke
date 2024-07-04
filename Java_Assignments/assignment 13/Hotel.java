package assn_13;
import java.util.Random;

public class Hotel extends Thread {
    public static double income=0;

    @Override
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        income=income+1000;
        System.out.println("Room Booked by "+currentThread().getName());
        System.out.println("Total Earning is "+income);

        synchronized (this) {
            this.notify();
        }
    }
}