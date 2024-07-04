#include<stdio.h>
#include<conio.h>
main()
{
   //5(base) raise to power 3(radix) = 125. 2 inputs from user
   int base, radix;
   int newnum, count=1;
   clrscr();

   printf("enter base:"); //5
   scanf("%d",&base);

   newnum=base;

   printf("enter radix:"); //3
   scanf("%d",&radix);

    for(;count<radix;)
    {
    newnum=newnum*base; //5=5*5*5
    count=count+1;
    }
    printf("\n%d",newnum);

   getch();
   return 0;
}