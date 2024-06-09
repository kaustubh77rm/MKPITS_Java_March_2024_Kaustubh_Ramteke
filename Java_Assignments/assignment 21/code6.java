//Program 6
//Java Program to find if a number is prime or not.
//A number is said to be a prime number if it is divisible
//Only by itself and unity.
//It should print all the prime number from 1 – 100;
package assignment_21;

public class code6 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i=2; i <= num/2; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}