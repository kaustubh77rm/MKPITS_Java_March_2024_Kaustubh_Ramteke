#include <stdio.h>
#include <conio.h>
int isPrime(int num) 
{
  int i;
  if (num<=1)
  {
    return 0;
  }
  if (num<=3)
  {
    return 1;
  }
  if (num%2==0 || num%3==0)
  {
    return 0;
  }
  for ( i=5; i*i<=num; i+=6)
  {
    if (num%i==0 || num%(i+2)==0)
    {
      return 0;
    }
  }
  return 1;
}

void printPrimeNumbers(int n)
{
  int num;
  printf("Prime numbers between 1 and %d are:\n", n);
  for ( num = 2; num <= n; num++)
  {
    if (isPrime(num)) 
    {
      printf("%d ", num);
    }
  }
  printf("\n");
}

int main() 
{
  int n;
  clrscr();

  printf("Enter an upper limit (n): ");
  scanf("%d", &n);

  printPrimeNumbers(n);

  getch();
  return 0;
}
