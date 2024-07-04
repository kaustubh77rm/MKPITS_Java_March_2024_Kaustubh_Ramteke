#include<stdio.h>
#include<conio.h>
int main() 
{ //type of given triangle: equilateral/isoceles/scalene
float side1, side2, side3;
clrscr();
    printf("Enter the lengths of three sides of the triangle: ");
    scanf("%f %f %f", &side1, &side2, &side3);

    // Check for valid triangle (sum of any two sides must be greater than the third)
    if (side1+side2<=side3||side2+side3<=side1||side1+side3<=side2) 
    {
        printf("Invalid triangle \n");
    } 
     else 
     {
     // Check for equilateral triangle
      if (side1 == side2 && side2 == side3) 
        {
	    printf("The triangle is equilateral\n");
	    }
	else
	{
	// Check for isosceles triangle
	if (side1 == side2 || side2 == side3 || side1 == side3)
	{
	 printf("The triangle is isosceles\n");
	}
	else
	{
	    // By default, it's scalene
	    printf("The triangle is scalene\n");
	}
	}
    }
getch();
return 0;
}