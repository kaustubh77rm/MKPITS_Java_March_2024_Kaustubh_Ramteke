#include <stdio.h>
#include <conio.h>
main()
{  //no of days calculate

   int month, year;
   clrscr();
   printf("Enter month number (1-12): ");
   scanf("%d", &month);

   printf("Enter year: ");
   scanf("%d", &year);

   switch (month) {
       case 1:
       case 3:
       case 5:
       case 7:
       case 8:
       case 10:
       case 12:
	   printf("Number of days = 31\n");
	   break;
       case 4:
       case 6:
       case 9:
       case 11:
	   printf("Number of days = 30\n");
	   break;
       case 2:
	   if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	       printf("Number of days = 29 (Leap year)\n");
	   } else {
	       printf("Number of days = 28\n");
	   }
	   break;
       default:
	   printf("Invalid month number.\n");
   }
   getch();
   return 0;
}
