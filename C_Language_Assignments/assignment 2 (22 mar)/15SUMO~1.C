#include <stdio.h>
#include <conio.h>
calculate_sum(int N)
{
 double sum=0, factorial=0;
 int i;
  if (N < 0)
  {
    printf("Error: N cannot be negative.\n");
    return -1.0; // Indicate error
  }

  //double sum = 0.0, factorial = 1.0;

  // Calculate the sum using a loop for each term
  for (i = 1; i <= N; i++) 
  {
    factorial *= i; // Calculate factorial for each term
    sum += i / factorial; // Cast i to double for decimal precision
  }

  return sum;
}

int main()
{
  double series_sum;
  int N;
  
  printf("Enter the upper limit (N): ");
  scanf("%d", &N);

  series_sum = calculate_sum(N);

  if (series_sum != -1.0) 
  {
    printf("Sum of series 1/1! + 2/2! + ... + %d/%d! is: %.4f\n", N, N, series_sum);
  }
  
  return 0;
}