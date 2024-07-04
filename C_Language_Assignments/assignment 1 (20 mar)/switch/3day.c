#include <stdio.h>
#include <conio.h>
int main() 
{
    int dayNumber;
    clrscr();
    printf("Enter a number between 1 and 7: ");
    scanf("%d", &dayNumber);

    switch (dayNumber) {
        case 1:
            printf("The day is Sunday\n");
            break;
        case 2:
            printf("The day is Monday\n");
            break;
        case 3:
            printf("The day is Tuesday\n");
            break;
        case 4:
            printf("The day is Wednesday\n");
            break;
        case 5:
            printf("The day is Thursday\n");
            break;
        case 6:
            printf("The day is Friday\n");
            break;
        case 7:
            printf("The day is Saturday\n");
            break;
        default:
            printf("Invalid day number (1-7)\n");
    }
    getch();
    return 0;
}
