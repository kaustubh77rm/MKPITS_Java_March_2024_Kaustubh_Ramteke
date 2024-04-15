#include<stdio.h>
#include<conio.h>
main()
{
   float fahrenheit, celsius;
   int input;

   clrscr();

   printf("Choose 1 or 2\n1: fahrenheit to celsius\n2: celsius to fahrenheit\n");
   scanf("%d",&input);

   switch(input)
   {
    case 1:

    printf("Enter Fahrenheit: ");
    scanf("%f",&fahrenheit);
    celsius = (fahrenheit - 32)*5/9;
    printf("\nCelsius: %f ", celsius);
    break;

    case 2:

    printf("Enter Celsius: ");
    scanf("%f",&celsius);
    fahrenheit = 32+(celsius*9/5);
    printf("\nFahrenheit: %f ", fahrenheit);
    break;

 }
   getch();
   return 0;
}