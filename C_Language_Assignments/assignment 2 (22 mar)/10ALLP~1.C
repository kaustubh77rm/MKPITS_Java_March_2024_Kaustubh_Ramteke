#include <stdio.h>
#include <conio.h>
#include <math.h>

int is_prime(int num)
{
  int i;
  //This function checks if a number is prime.

  if (num <= 1)
  {
    return 0; // 1 or less are not prime
  }
  for (i = 2; i <= sqrt(num); i++)
  {
    if (num % i == 0)
    {
      return 0; // Divisible by a number other than 1 and itself
    }
  }
  return 1; // Prime number
}

int main()
{
  int N,i;
  clrscr();
  printf("Enter an upper limit (N): ");
  scanf("%d", &N);

  printf("Prime numbers between 1 and %d are: \n", N);

  // Iterate through numbers from 1 to N and check for prime using the is_prime function
  for (i = 1; i <= N; i++)
  {
    if (is_prime(i))
    {
      printf("%d ", i);
    }
  }

  printf("\n");
  getch();
  return 0;
}