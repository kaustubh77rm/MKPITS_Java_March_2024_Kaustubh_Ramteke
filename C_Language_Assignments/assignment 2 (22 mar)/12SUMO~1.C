#include <stdio.h>
#include <conio.h>
int main()
{
    int N, sum;
    clrscr();
    printf("Enter the upper limit (N): ");
    scanf("%d", &N);

    // formula to calculate sum of squares (1^2 + 2^2 + ... + N^2)
    sum = N*(N+1)*(2*N+1)/6;

    printf("The sum of the series 1^2 + 2^2 + ... + %d^2 is: %d\n", N, sum);
    getch();
    return 0;
}
