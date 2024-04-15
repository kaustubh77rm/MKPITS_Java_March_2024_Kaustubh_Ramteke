#include <stdio.h>
int main() 
{   //2nd biggest number
    int size, i;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

        printf("Enter %d elements:\n", size);
        for (i=0; i<size; i++) 
        {
            scanf("%d", &arr[i]);
        }

    // Initialize variables for the first 2 elements
    int largest = arr[0];
    int secondLargest = arr[1];

    // Ensure initial values are correctly assigned
    if (secondLargest > largest) 
    {
        int temp = largest;
        largest = secondLargest;
        secondLargest = temp;
    }

    // Iterate through the array to find the 2nd largest element
    for (i = 2; i < size; i++) 
    {
        if (arr[i] > largest) 
        {
            secondLargest = largest;
            largest = arr[i];
        } 
        else if (arr[i] > secondLargest && arr[i] != largest) 
        {
            secondLargest = arr[i];
        }
    }

    printf("The second largest element is: %d\n", secondLargest);
    return 0;
}