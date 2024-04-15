#include<stdio.h>
#include<conio.h>
main()
{
    clrscr();
    reverse();
    getch();
    return 0;
}
int reverse()
{
    int num, rem, rev=0;
    
    printf("enter num:");
    scanf("%d",&num);
    for(;num>0;)
    {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
    }
    printf("reverse: %d",rev);
    return rev;
}