#include<stdio.h>
#include<conio.h>
main()
{
    int no=0,result;
    clrscr();
    printf("enter no:");
    scanf("%d",&no);
    result=fact(no);
    printf("factorial is %d",result);
    getch();
    return 0;
}
int fact(int no)
{
  int result=1,i;
   for(i=1;i<no;i++)
   {
    result=result*i;
   }
   return result;
}