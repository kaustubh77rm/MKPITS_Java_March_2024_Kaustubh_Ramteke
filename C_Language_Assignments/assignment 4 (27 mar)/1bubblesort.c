#include <stdio.h>
void bubbleSort(int arr[], int n) 
{   // Iterate through the array multiple times
    int i,temp;
    int swapped = 0;
    for (i=0; i<n-1; i++)
    {   // Optimize by tracking if any swaps occurred in a pass
        for (int j=0; j<n-i-1; j++) 
        {
            if (arr[j] > arr[j+1]) 
            {
                // Swap elements
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = 1;  // Indicate a swap happened
            }
        }
        // If no swaps occurred, the array is already sorted
        if (!swapped) 
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

    bubbleSort(array, size);

    printf("\nSorted array: \n");
    for (i = 0; i < size; i++) 
    {
        printf("%d ", array[i]);
    }
    return 0;
}