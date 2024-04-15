#include<stdio.h>
#include<conio.h>
main()
{
int num;  
clrscr();

    printf("enter a number:");
    scanf("%d",&num);

    if(num>10)
    printf("number is greater than 10");

    else if(num<=10)
    {
	if(num<10&&num>4)
	printf("number ranges between 5-9");

	else if(num<5)
	printf("number ranges between 0-4");

	else
	printf("number is 10");
    }

getch();
return 0;
}