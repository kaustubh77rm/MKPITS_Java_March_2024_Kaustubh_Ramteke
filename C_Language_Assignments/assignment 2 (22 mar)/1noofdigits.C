#include<stdio.h>
#include<conio.h>
main()
{ //count digits in a number 8935 -> 4
int num,count=0;
clrscr();
printf("Enter a number: ");
  scanf("%d",&num);

  if (num==0)
  { // Handle the case of 0 separately
    count=1;
  }
  else
  {
    // Loop until the number becomes 0
    while(num!=0)
    {
      num/= 10;  // Remove the last digit
      count++;
    }
  }
  printf("number of digits is %d\n", count);
getch();
return 0;
}