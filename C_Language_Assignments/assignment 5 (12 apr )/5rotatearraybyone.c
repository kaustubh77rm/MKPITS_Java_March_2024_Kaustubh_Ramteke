#include<stdio.h>

int main() 
{
    int arr[5] = {1, 2, 3, 4, 5};
    int last = arr[4]; // Store the last element of the array
    int i;

    // Move each element one position to the right
    for (i = 3; i >= 0; i--) 
    {
        arr[i + 1] = arr[i];
    }

    // Put the last element in the first position
    arr[0] = last;

    // Print the rotated array
    for (i = 0; i < 5; i++) 
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
