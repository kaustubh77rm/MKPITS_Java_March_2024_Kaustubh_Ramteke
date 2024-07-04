#include<stdio.h>
#include<conio.h>
main()
{   //palindrome code
    int nnum, num, rem, rev=0;

    printf("enter num:");
    scanf("%d",&num);

    nnum=num;

    while(num>0)
    {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
    }

    if(nnum<100)
    printf("\nenter 3 digit number");

    else if(nnum==rev)
    printf("\npalindrome");
    
    else printf("\nnot palindrome");
    return 0;
}