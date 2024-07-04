#include <stdio.h>
int main() 
{
    int array[5] = {5, 2, 3, 1, 4};
    int i, temp, min, max;

    // Assume the first element is both min and max initially
    min = max = array[0];

    // Loop to find min and max from array
    for (i=1; i<5; i++) 
    {
        if (array[i] < min) 
        {
            min = array[i];
        }
        
        if (array[i] > max) 
        {
            max = array[i];
        }
    }

    printf("Minimum element: %d\n", min);
    printf("Maximum element: %d\n", max);

    return 0;
}
