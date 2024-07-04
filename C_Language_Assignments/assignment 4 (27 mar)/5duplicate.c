#include <stdio.h>
// Function to remove duplicates from a sorted array 
int remove_duplicates(int arr[], int n) 
    {
    if (n == 0 || n == 1)
    {
        return n;  // Array is already unique
    }
    int write_index = 1;  // Index for unique elements

    for(int i = 1; i < n; i++) 
        {
            if (arr[i] != arr[write_index - 1]) 
            {
             arr[write_index] = arr[i];
             write_index++;
            }
        }
    return write_index;  // Return the new size of the array
    }

int main() 
{
    int arr[55];
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("enter size of array:");
    scanf("%d",&n);

    printf("enter elements:");
    for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);

    printf("\nOriginal array: ");
    for (int i = 0; i < n; i++) 
    {
        printf("%d ", arr[i]);
    }
    n = remove_duplicates(arr, n);

    printf("\nArray after removing duplicates: ");
    for (int i = 0; i < n; i++) 
    {
        printf("%d ", arr[i]);
    }
    return 0;
}