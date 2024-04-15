#include <stdio.h>
#include <conio.h>
int main() 
{
    int num, i;
    float sum=0.0;
    //clrscr();

    printf("Enter a positive number: ");
    scanf("%d", &num);

    // Handle invalid input (non-positive numbers)
    if (num <= 0) {
        printf("Invalid input. Please enter a positive number.\n");
        return 1;
    }

    // Calculate the sum using a loop
    for (i = 1; i <= num; i++) {
        sum += 1.0 / i;  // Cast to float for decimal precision
    }

    printf("The sum of the harmonic series up to %d is: %.4f\n", num, sum);
    getch();
    return 0;
}