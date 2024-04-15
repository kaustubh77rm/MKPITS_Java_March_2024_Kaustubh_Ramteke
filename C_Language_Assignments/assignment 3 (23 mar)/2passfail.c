#include<stdio.h>
#include<conio.h>
int result(int);
int main()
{   //>=50 pass else fail
    //clrscr();
    int num1;
    printf("enter marks:");
    scanf("%d",&num1);
    result();
    getch();
    return 0;
}
int result(int num)
{
    if(num>=50)
    printf("pass");
    else 
    printf("fail");
    return num;
}