#include <stdio.h>
#include <conio.h>
int main()
{  //eligibility admission
  int entrance_score, previous_average,min_entrance_score=60,min_academic_average=70;
  clrscr();
  printf("Enter entrance exam score (out of 100): ");
  scanf("%d", &entrance_score);

  printf("Enter previous academic performance average (out of 100): ");
  scanf("%d", &previous_average);

  // Minimum eligibility requirements
   //int min_entrance_score = 60;
   //int min_academic_average = 70;

  // Check eligibility based on entrance score and academic performance
  if (entrance_score >= min_entrance_score && previous_average >= min_academic_average) {
    printf("\nCongratulations! You are eligible for admission.\n");
  } else {
    printf("\nUnfortunately, you are not eligible for admission.\n");
    // Optionally provide additional information on why they are not eligible
    if (entrance_score < min_entrance_score) {
      printf("\nMinimum entrance score requirement not met (%d required, you scored %d).\n",
	     min_entrance_score, entrance_score);
    }
    if (previous_average < min_academic_average) {
      printf("\nMinimum academic performance average requirement not met (%d required, you scored %d).\n",
	     min_academic_average, previous_average);
    }
  }
  getch();
  return 0;
}
