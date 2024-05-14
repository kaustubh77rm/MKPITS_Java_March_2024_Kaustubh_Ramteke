package assn_13;

public class HotelCode extends Object {
    public static void main(String[] args) {
        int room=10;
        for (int i=0; i<=10; i++) {

            Hotel hotelBooking = new Hotel();
            hotelBooking.start();
            synchronized (hotelBooking) {
                try {
                    hotelBooking.wait();
                } catch (InterruptedException e) {
                    System.out.println("exception occurred");
                    e.printStackTrace();
                }
            }
        }
    }
}