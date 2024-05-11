package anonymous_vehicle;

public interface Rentable {
    public double calRent();
    public void disDetails();

    public static void main(String[] args) {
        Rentable r1 = new Rentable() {
            private String vehicle="Car";
            private double hourlywork=50;
            private double hourlyrent=70;
            @Override
            public double calRent() {
                return hourlyrent*hourlywork;
            }
            @Override
            public void disDetails() {
                System.out.print("Vehicle: " + vehicle+",");
                System.out.print(" Rent: ₹" + calRent());
            }
        };
        r1.disDetails();

        Rentable r2 = new Rentable() {
            private String vehicle="bike";
            private int hourlywork=50;
            private int hourlyrent=40;
            @Override
            public double calRent() {
                return hourlyrent*hourlywork;
            }

            @Override
            public void disDetails() {
                System.out.print("\nVehicle: " + vehicle+",");
                System.out.print(" Rent: ₹" + calRent());
            }
        };
        r2.disDetails();
        Rentable r3 = new Rentable() {
            private String vehicle="truck";
            private int hourlywork=50;
            private int hourlyrent=80;
            @Override
            public double calRent() {
                return hourlyrent*hourlywork;
            }

            @Override
            public void disDetails() {
                System.out.print("\nVehicle: " + vehicle+",");
                System.out.print(" Rent: ₹" + calRent());
            }
        };
        r3.disDetails();
    }
}