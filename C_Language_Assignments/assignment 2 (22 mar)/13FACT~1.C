#include <stdio.h>
#include <conio.h>
#include <math.h>
int count_digits(int n)
{
  //number of digits in the factorial of a number.
  if (n<0)
  {
    return -1; // Handle negative input (factorials are undefined)
  }  else if (n <= 1)
    {
      return 1; // Factorial of 0 or 1 is 1 (single digit)
    }
    else
    {
    // Use Stirling's approximation to estimate the logarithm of the factorial
    double x = n * log(n) - n + log(sqrt(2 * M_PI * n));
    // Count digits based on the estimated logarithm (base 10)
    return floor(x / log(10)) + 1;
    }
 }

int main()
{
  int num,digits;
  clrscr();
  printf("Enter a non-negative number: ");
  scanf("%d", &num);

  digits = count_digits(num);

  if (digits == -1) {
    printf("Factorial is undefined for negative numbers.\n");
  } else {
    printf("The number of digits in the factorial of %d is approximately %d.\n", num, digits);
  }
  getch();
  return 0;
}