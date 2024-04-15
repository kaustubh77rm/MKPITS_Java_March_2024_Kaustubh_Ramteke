#include<stdio.h>
int evenOdd(int);
main()
{
    int num;
    //clrscr();
    printf("enter a number:");
    scanf("%d",&num);
    
    evenOdd(num);
    return 0;
}
int evenOdd(int num1)
{   //even or odd code

    if(num1%2==0)
    printf("even number");
    else 
    printf("odd number");
    return num1;
}
