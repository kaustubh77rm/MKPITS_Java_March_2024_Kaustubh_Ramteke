#include<stdio.h>
#include<conio.h>
main()
{
    clrscr();
    three();
    getch();
    return 0;
}
int three()
{
    int num1,num2,num3;
    printf("enter 3 numbers:");
    scanf("%d%d%d",&num1,&num2,&num3);

    if(num1>num2 && num1>num3) //1>2 1>3
    printf("\n%d is greatest",num1);

    else if(num2>num1 && num2>num3)
    printf("\n%d is greatest",num2);

    else printf("\n%d is greatest",num3);
    return 1;
}