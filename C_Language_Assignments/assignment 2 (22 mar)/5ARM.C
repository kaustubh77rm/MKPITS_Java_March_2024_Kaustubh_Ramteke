#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{
    int N,i, originalNum, remainder, n = 0, result = 0;
    clrscr();
    printf("Enter a number: ");
    scanf("%d", &N);

    printf("Armstrong numbers between 1 and %d are: \n", N);

    // Loop from 1 to N
    for (i = 1; i <= N; ++i)
    {
        originalNum = i;

        // Count the number of digits (optional for efficiency)
        while (originalNum != 0) {
            originalNum /= 10;
	    n++;
        }

        originalNum = i;

        // Calculate the sum of digits raised to power of number of digits
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the number is Armstrong
        if (result == i) {
            printf("%d ", i);
        }

        // Reset variables for next iteration
        n = 0;
        result = 0;
    }

    printf("\n");
    getch();
    return 0;
}
