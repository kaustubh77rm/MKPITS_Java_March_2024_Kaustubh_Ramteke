#include<stdio.h>
#include<conio.h>
int main()
{
  int i=3,n;
  int t1=0, t2=1;
  // initialize the next term (3rd term)
  int nextterm = t1+t2;
  clrscr();
  // get no. of terms from user
  printf("Enter the number of terms: ");
  scanf("%d", &n);

  // print the first two terms t1 and t2
  printf("Fibonacci Series: %d %d ", t1, t2);

  // print 3rd to nth terms
  do
  {
    printf("%d ", nextterm);
    t1 = t2;
    t2 = nextterm;
    nextterm = t1 + t2;
    i++;
  } while(i<=n);

  getch();
  return 0;
}