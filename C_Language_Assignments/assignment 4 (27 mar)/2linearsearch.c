#include <stdio.h>
void linearsearch();

main()
{
    linearsearch();
}

void linearsearch()
{
    int size, num, i;
    int array[55];
    int found=0;
    printf("enter size of array:");
    scanf("%d", &size);

    printf("enter %d elements:", size);
    for(i=0; i<size; i++)
    scanf("%d", &array[i]);

    printf("enter number to search: ");
    scanf("%d", &num);

    for(i=0; i<size; i++)
    {
        if (array[i]==num)
        {
            printf("%d found at place no %d",num, i+1);
            found=1;
            break;
        }
    }
    if(found==0)
     printf("Not Found");
}