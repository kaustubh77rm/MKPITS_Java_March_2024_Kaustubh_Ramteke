package assn_13;
import java.util.Random;

public class Hotel extends Thread {
    private static int totalEarnings = 0;
    private int bookingAmount;
    private int roomsBooked;
    private Random random;

    public Hotel() {
        this.totalEarnings =0;
        this.roomsBooked = 0;
    }

    public synchronized void run() {
        bookingAmount = (int)(Math.random()*100)+50;
        totalEarnings = totalEarnings + bookingAmount;
        roomsBooked++;
        System.out.print(" "+Thread.currentThread().getName());
        //System.out.print(" "+bookingAmount);
        System.out.println(" Total earnings: ₹" + totalEarnings);
    }
}
/*
        for (int i=0; i<10; i++){
            Hotel h = new Hotel();
            h.start();
*/