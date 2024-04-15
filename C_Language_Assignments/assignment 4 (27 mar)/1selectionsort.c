#include <stdio.h>
void selectionSort(int arr[], int n) 
{   // Iterate through the array multiple times
    int i,j,temp;
    int swapped = 0;
    for (i=0; i<n; i++)
    {   // Optimize by tracking if any swaps occurred in a pass
        for (j=i+1; j<n; j++) 
        {
            if (arr[i] > arr[j]) 
            {
                // Swap elements
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swapped = 1;  // Indicate a swap happened
            }
        }
        // If no swaps occurred, the array is already sorted
        if (swapped!=1) 
        {
            break;
        }
    }
}
int main() 
{
    int array[99],size, i;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &size);

    printf("Enter %d elements for the array: \n", size);
    for (i = 0; i < size; i++) 
    {
        scanf("%d", &array[i]);
    }
    printf("Original array: \n");
    for (i = 0; i < size; i++) 
    {
        printf("%d ", array[i]);
    }

    selectionSort(array, size);

    printf("\nSorted array: \n");
    for (i = 0; i < size; i++) 
    {
        printf("%d ", array[i]);
    }
    return 0;
}