#include <stdio.h>
#include <conio.h>
int main()
{   //n natural num divisible by 3 and 5
    int N, limit, sum = 0;
    clrscr();
    printf("Enter an upper limit (N): ");
    scanf("%d", &N);

    // Find the largest number divisible by both 3 and 5 within the limit
    limit = N - (N % 15);

    // Calculate the sum using an arithmetic series formula
    sum = (limit / 15) * (limit + 15) / 2;

    printf("\nSum of first %d natural numbers divisible by both 3 and 5 is: %d\n", N, sum);
    getch();
    return 0;
}
