#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{ //perfect square code
  int number,root,input;

  clrscr();

  printf("Enter a number: ");  //5
  scanf("%d", &number);

  root=sqrt(number);          //2.34435

  input=root*root;            //4.446

     if((int)input==number)     //4.446==5
     {
      printf("%d is a perfect square\n",number);
     }
     else
     {
     printf("%d not a perfect square\n",number);
     }

  getch();
  return 0;
}
