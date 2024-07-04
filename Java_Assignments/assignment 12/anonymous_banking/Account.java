package anonymous_banking;

// Define the Account interface
interface Account {
    void calculateInterest();
    void displayDetails();
}

// Main class for the banking system
 class BankingSystem {

    // Inner class for Savings Account
    class SavingsAccount implements Account {
        private double balance;
        private double interestRate;

        public SavingsAccount(double balance, double interestRate) {
            this.balance = balance;
            this.interestRate = interestRate;
        }

        @Override
        public void calculateInterest() {
            double interest = balance * interestRate;
            balance += interest;
        }

        @Override
        public void displayDetails() {
            System.out.println("Savings Account:");
            System.out.println("Balance: ₹" + balance);
            System.out.println("Interest Rate: " + interestRate * 100 + "%");
        }
    }

    // Inner class for Current Account
    class CurrentAccount implements Account {
        private double balance;

        public CurrentAccount(double balance) {
            this.balance = balance;
        }

        @Override
        public void calculateInterest() {
            // Current accounts typically don't earn interest
        }

        @Override
        public void displayDetails() {
            System.out.println("Current Account:");
            System.out.println("Balance: ₹" + balance);
        }
    }

    // Inner class for Fixed Deposit Account
    class FixedDepositAccount implements Account {
        private double balance;
        private double interestRate;
        private int durationMonths;

        public FixedDepositAccount(double balance, double interestRate, int durationMonths) {
            this.balance = balance;
            this.interestRate = interestRate;
            this.durationMonths = durationMonths;
        }

        @Override
        public void calculateInterest() {
            double interest = balance * interestRate * durationMonths / 12;
            balance += interest;
        }

        @Override
        public void displayDetails() {
            System.out.println("Fixed Deposit Account:");
            System.out.println("Balance: ₹" + balance);
            System.out.println("Interest Rate: " + interestRate * 100 + "%");
            System.out.println("Duration: " + durationMonths + " months");
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Create instances of different types of accounts
        Account savingsAccount = bankingSystem.new SavingsAccount(1000, 0.05);
        Account currentAccount = bankingSystem.new CurrentAccount(2000);
        Account fixedDepositAccount = bankingSystem.new FixedDepositAccount(5000, 0.08, 12);

        // Calculate interest for each account
        savingsAccount.calculateInterest();
        fixedDepositAccount.calculateInterest();

        // Display details of each account
        savingsAccount.displayDetails();
        currentAccount.displayDetails();
        fixedDepositAccount.displayDetails();
    }
}
