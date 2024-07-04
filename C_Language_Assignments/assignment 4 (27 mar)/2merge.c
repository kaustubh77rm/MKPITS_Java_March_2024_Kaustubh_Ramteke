#include <stdio.h>
void merge();
void main()
{
    merge();
}
void merge() 
{
    int arr1[50], arr2[50], merged[100];
    int n1, n2, i, j, k;

    // Get the size of the first array
    printf("Enter the size of the first array: ");
    scanf("%d", &n1);

    // Get elements of the first array
    printf("Enter %d elements for the first array:\n", n1);
    for (i = 0; i < n1; i++) 
    {
        scanf("%d", &arr1[i]);
    }
    // Get the size of the second array
    printf("Enter the size of the second array: ");
    scanf("%d", &n2);
    // Get elements of the second array
    printf("Enter %d elements for the second array:\n", n2);
    for (i = 0; i < n2; i++) 
    {
        scanf("%d", &arr2[i]);
    }
                // Merge the arrays 
        k = 0;  // index for merged array
        
        for (i = 0; i < n1; i++) 
        {
         merged[k++] = arr1[i];
        }

        for (i = 0; i < n2; i++) 
        {
         merged[k++] = arr2[i];
        }
        // Print the merged array
        printf("Merged array is:\n");

        for (i=0; i<n1+n2; i++)     
        {
         printf("%d ", merged[i]);
        }
}