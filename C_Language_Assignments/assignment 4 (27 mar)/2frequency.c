#include <stdio.h>
void frequency();

main()
{
    frequency();
}

void frequency()
{
    int size, num,i,count=0;
    int array[55];

    printf("enter size of array:");
    scanf("%d", &size);

    printf("enter %d elements:", size);

    for (i = 0; i < size; i++)
        scanf("%d", &array[i]);

    printf("enter number to find frequency: ");
    scanf("%d", &num);

    for(i=0;i<size;i++)
    {
        if(array[i]==num)
        {
        count++;
        }
    }
    printf("frequency of %d is %d",num,count);
    }

    