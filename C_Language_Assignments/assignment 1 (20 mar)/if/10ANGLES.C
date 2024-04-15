#include <stdio.h>
#include<conio.h>
int main()
{
    int angle;
    clrscr();
    printf("Enter angle in degree: ");
    scanf("%d",&angle);

    if (angle>180)
	printf("invalid angle\n");

    else if (angle==90)
	printf("The angle is a right angle\n");

    else if (angle>90)
	printf("The angle is obtuse\n");

    else
    printf("acute angle");

    getch();
    return 0;
}
