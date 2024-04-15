#include <stdio.h>
#include <conio.h>
int main() 
{
    int N, i;
    float number, average, sum = 0.0;
    clrscr();
    printf("Enter the number of elements (N): ");
    scanf("%d", &N);

    // Input validation (handle non-positive N)
    if (N <= 0) {
        printf("Error: Please enter a positive number of elements.\n");
        return 1;
    }

    printf("Enter %d numbers:\n", N);

    // Loop to get N numbers from the user and calculate sum
    for (i = 1; i <= N; i++) {
        scanf("%f", &number);
        sum += number;
    }

    // Calculate average
    average = sum / N;

    printf("The average of the %d numbers is: %.2f\n", N, average);
    
    getch();
    return 0;
}