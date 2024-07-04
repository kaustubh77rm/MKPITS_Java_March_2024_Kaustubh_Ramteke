package anonymous_library;

public interface LibraryItems {
public double checkOut();
public void returnItem();

    public static void main(String[] args) {
        LibraryItems l = new LibraryItems() {
            private String book = "friends";
            private double rent = 20;
            private double daysrented = 30;

            @Override
            public double checkOut() {
                return rent * daysrented;
            }

            @Override
            public void returnItem() {
                System.out.print("Book: " + book + ",");
                System.out.print(" Rent: ₹" + checkOut());
            }
        };
        l.returnItem();

        LibraryItems l2 = new LibraryItems() {
            private String book = "harry potter";
            private double rent = 40;
            private double daysrented = 30;

            @Override
            public double checkOut() {
                return rent * daysrented;
            }

            @Override
            public void returnItem() {
                System.out.print("\nBook: " + book + ",");
                System.out.print(" Rent: ₹" + checkOut());
            }
        };
        l2.returnItem();
    }
}