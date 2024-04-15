#include <stdio.h>
#include <conio.h>
int main()
{
  int purchase;
  float saving,total;
clrscr();

printf("enter amount of purchase:");
scanf("%d",&purchase);
if(purchase>5000)
saving=0.3*purchase;

else if (purchase<4000)
saving=0.2*purchase;

else if (purchase<3000)
saving=0.1*purchase;

total=saving+purchase;
printf("total: %f",total);

//printf("");
getch();
return 0;
}
