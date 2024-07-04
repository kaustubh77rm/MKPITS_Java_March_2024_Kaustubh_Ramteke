#include<stdio.h>
main()
{
  int i,j;
  //clrscr();
  for(i=0;i<6;i++)
  {
    for(j=0;j<i;j++)
    {
    printf("%d",i);
    }
    printf("\n");
  }
  return 0;
}