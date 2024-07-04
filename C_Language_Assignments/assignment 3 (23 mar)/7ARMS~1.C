#include<stdio.h>
int arm()
{
int rem, num, nnum, sum=0;
    
    printf("enter a number:"); //153
    scanf("%d",&num);
    nnum=num; //nnum=153

    while(nnum>0)
    {
	rem=nnum%10;  // 3
	sum=sum+(rem*rem*rem);  //27
	nnum=nnum/10; //15
    }
    if(num==sum)
    printf("armstrong");
    else printf("not armstrong");
    return num;
}
main()
{   // armstrong number= 153 = 1+125+27 = 153
    arm();
    return 0;
}