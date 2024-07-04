package assn_13;

public class BankAccount{
        private double balance;

        public BankAccount(double initialBalance){
            this.balance = initialBalance;
        }

        public synchronized void deposit(double amount){
            System.out.println("Depositing ₹" + amount);
            balance = balance+amount;
            System.out.println("New balance after deposit: ₹" + balance);
        }

        public synchronized void withdraw(double amount){
            if(balance >= amount){
                System.out.println("Withdrawing ₹" + amount);
                balance = balance-amount;
                System.out.println("New balance after withdrawal: ₹" + balance);
            }else{
                System.out.println("Insufficient funds for withdrawal.");
            }
        }

        public static void main(String[] args){
            BankAccount account = new BankAccount(1000);

            Thread depositThread1 = new Thread(() -> {
                account.deposit(200);
            });

            Thread depositThread2 = new Thread(() -> {
                account.deposit(300);
            });

            Thread withdrawThread1 = new Thread(() -> {
                account.withdraw(400);
            });

            Thread withdrawThread2 = new Thread(() -> {
                account.withdraw(700);
            });

            depositThread1.start();
            depositThread2.start();
            withdrawThread1.start();
            withdrawThread2.start();
        }
}