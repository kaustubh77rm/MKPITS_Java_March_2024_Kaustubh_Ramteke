//An array contains 30 integers.
// Write a program to read every 3rd element of the array,
// compute the square of the array and print the addition of all the squares
//E.g. [1,2,2,4,5,6,7,8,3,10]
//Answer is (2x2) + (6x6) + (3x3) = 49
package assignment_21;

public class code1 {
    public static void main(String[] args) {
        int[] arr = new int[35];
        int sumOfSquares = 0;

        for (int i=1; i<=30; i++) {
            arr[i]=i+1;
        }

        for (int i=1; i<=32; i+=3) {
            int square=arr[i]*arr[i];
            sumOfSquares+=square;
        }
        System.out.println(sumOfSquares);
    }
}