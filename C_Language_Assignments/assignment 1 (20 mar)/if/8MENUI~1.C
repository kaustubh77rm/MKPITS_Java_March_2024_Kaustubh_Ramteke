#include <stdio.h>
#include <conio.h>
int main()
{
  int number,tax=20,tip,total;
  clrscr();
  printf("enter what you want:\n");
  printf("1 samosa for rs20\n2 kachori for rs15\n3 dosa for rs30\n\n");
  scanf("%d",&number);
  printf("enter a tip:");
  scanf("%d",&tip);

  if (number==1)
  {
  total=20+tax+tip;
  printf("total: %d",total);
  }

  else if (number==2)
  {
  total=15+tax+tip;
  printf("total: %d",total);
  }

  else if (number==3)
  {
  total=30+tax+tip;
  printf("total: %d",total);
  }
  else
  printf("\nenter valid number");
  getch();
  return 0;
}
