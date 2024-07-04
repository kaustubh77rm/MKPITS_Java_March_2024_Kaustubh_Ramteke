#include <stdio.h>
#include <conio.h>
int main()
{
  double weight, height, bmi;
  clrscr();
  printf("Enter weight (kg): ");
  scanf("%d", &weight);

  printf("Enter height (meters): ");
  scanf("%d", &height);

  // Calculate BMI
  bmi=weight/(height*height);

  // Categorize BMI using if statements
  if (bmi < 18)
  {
    printf("Underweight\n", bmi);
  }
  else if(bmi>=18 && bmi<25)
  {
    printf("Normal weight\n", bmi);
  }
  else
  {
    printf("Overweight\n", bmi);
  }
  getch();
  return 0;
}
