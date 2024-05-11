package stud;
import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.print("Enter number of rows for the first matrix: ");
        int row1 = scanner.nextInt();
        System.out.print("Enter number of columns for the first matrix: ");
        int col1 = scanner.nextInt();
        System.out.print("Enter number of rows for the second matrix: ");
        int row2 = scanner.nextInt();
        System.out.print("Enter number of columns for the second matrix: ");
        int col2 = scanner.nextInt();

        // Check if matrices can be multiplied
        if (col1 != row2)
        {
            System.out.println("Matrices cannot be multiplied as the number of columns of the first matrix " +
                    "is not equal to the number of rows of the second matrix.");
            return;
        }

        // Input elements of the matrices
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = inputMatrix(row1, col1, scanner);
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = inputMatrix(row2, col2, scanner);

        // Multiply the matrices
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Output the resulting matrix
        if (result != null)
        {
            System.out.println("Resultant matrix after multiplication:");
            printMatrix(result);
        }
    }

    // Method to input elements of a matrix
    public static int[][] inputMatrix(int m, int n, Scanner scanner)
    {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
    {
        int col1 = matrix1.length;
        int row1 = matrix1[0].length;
        int col2 = matrix2.length;
        int row2 = matrix2[0].length;

        if (row1 != col2)
        {
            System.out.println("number of columns of the first matrix " +
                    "is not equal to the number of rows of the second matrix.");
            return null; // Return null indicating multiplication is not possible
        }

        int[][] result = new int[col1][row2];

        for (int i = 0; i < col1; i++)
        {
            for (int j = 0; j < row2; j++)
            {
                for (int k = 0; k < row1; k++)
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}