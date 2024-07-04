#include<stdio.h>
main()
{
  int i,j,space;
  //clrscr();
  for(i=1; i<6; i++)
  { 
    for(space=1; space<=5-i; space++)
    {
      printf(" ");
    }
    for(j=1;j<=2*i-1;j++)
    {
    printf("*",i);
    }
    printf("\n");
  }
  
  return 0;
}