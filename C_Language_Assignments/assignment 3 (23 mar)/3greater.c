#include<stdio.h>
#include<conio.h>
main()
{
    clrscr();
    greater();
    getch();
    return 0;
}
int greater()
{
    int num1,num2;
    printf("enter 2 numbers:");
    scanf("%d%d",&num1,&num2);

    if(num1>num2)
    printf("%d is greater",num1);
    else if(num2>num1)
    printf("%d is greater",num2);
    else
    printf("both are equal");
    return 1;
}