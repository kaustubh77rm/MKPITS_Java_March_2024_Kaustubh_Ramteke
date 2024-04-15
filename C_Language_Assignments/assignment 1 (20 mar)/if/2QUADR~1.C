#include<stdio.h>
#include<math.h>
#include<conio.h>
int main()
{
  float a, b, c, discriminant, root1, root2;
  clrscr();
  printf("Enter coefficients a, b, and c: ");
  scanf("%f %f %f", &a, &b, &c);

  // Calculate discriminant
  discriminant=b*b-4*a*c;

  if (discriminant>0)
  {
    // Two real and distinct roots
    root1 = (-b + sqrt(discriminant)) / (2.0 * a);
    root2 = (-b - sqrt(discriminant)) / (2.0 * a);
    printf("Roots are real and distinct\n");
    printf("Root 1 = %f\n", root1);
    printf("Root 2 = %f\n", root2);
  }
  else if (discriminant == 0)
  {
    // Two equal real roots
    root1 = root2 = -b / (2.0 * a);
    printf("Roots are real and equal\n");
    printf("Root 1 = Root 2 = %f\n", root1);
  }
  else
  {
    // No real roots
    printf("Roots are imaginary\n");
  }
  getch();
  return 0;
}