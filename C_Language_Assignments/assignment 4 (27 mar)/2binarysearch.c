#include <stdio.h>
void binarysearch();
main()
{
    binarysearch();
}
void binarysearch()
{
    int array[55], size, i, findnum;
    int swapped=0, temp;
    int min, max, mid;

    printf("enter size of array:");
    scanf("%d",&size);

    printf("\nenter %d elements:",size);
    for(i=0; i<size; i++)
        scanf("%d",&array[i]);

    for (i=0; i<size; i++)
    {
        for (int j=i+1; j<size; j++) 
        {
            if (array[i] > array[j]) 
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                swapped = 1;
            }
        }
        if (!swapped) 
        {
            break;
        }
    }

    printf("enter number to find:");
    scanf("%d",&findnum);

    min = 0;                    // min index of array
    max = size - 1;             // max index of array
    while (min <= max)
    {
        mid = (min+max)/2;
        if (array[mid] == findnum)
        {
            printf("Element found at index %d\n", mid+1);
            return;
        }
        else if (array[mid] < findnum)
        {
            min = mid+1;
        }
        else
        {
            max = mid-1;
        }
    }
    printf("Element not in array\n");
}