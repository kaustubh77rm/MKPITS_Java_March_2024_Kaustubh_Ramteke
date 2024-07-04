#include<stdio.h>
#include<conio.h>
main()
{   //all prime no from 1 to n
    int no;
    clrscr();
    printf("enter a number:");
    scanf("%d",&no);
    prime(int no);
    getch();
    return 0;
}
int prime(int num1)
{
    int i,num, count=0;

    if(num%i==0)  // 5%i==0
    count=count+1;
    num=num+1;

    if(count>2)
    {
    continue;
    }

     else
     {
     printf("%d ",num);
     }

    }
return num;
}