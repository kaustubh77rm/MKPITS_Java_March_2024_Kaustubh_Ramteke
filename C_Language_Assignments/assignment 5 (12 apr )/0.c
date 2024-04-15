#include<stdio.h>
#include<stdlib.h> // for malloc
int main() 
{   //eliminate duplicate values from array and display
    int array[55], size, i, j, *ptr, count = 0;

    printf("Enter size of array: "); 
    scanf("%d", &size);

    printf("Enter %d elements: ", size);
    for (i=0; i<size; i++) 
    {
        scanf("%d", &array[i]);
    }

    for (i=0; i<size; i++) 
    {
        for (j=0; j<i; j++) 
        {
            if (array[j]==array[i]) 
            {
                array[i] = 0;
                break;
            }
        }
    }
    
    for(i=0; i<size; i++) 
    {
        if (array[i] != 0) 
        {
            count++;
        }
    }

    ptr = (int*)malloc(sizeof(int) * count);

    // Store non-zero elements in ptr
    for (i=0,j=0; i<size; i++) 
    {
        if (array[i] != 0) 
        {
            ptr[j++] = array[i];
        }
    }

    printf("count: %d\n", count);
    for (i=0; i<count; i++) 
    {
        printf("%d ", ptr[i]);
    }

    return 0;
}