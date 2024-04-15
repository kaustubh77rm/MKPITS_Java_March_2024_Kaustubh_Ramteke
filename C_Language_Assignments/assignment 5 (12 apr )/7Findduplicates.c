//Find duplicates in an array
#include <stdio.h>
int main() 
{
    int arr[10] = {1,4,2,2,3,8,8,5,3,6};
    int i, j;

    printf("Duplicates in the array: ");
    for (i=0; i<10; i++) 
    {
        for (j=i+1; j<10; j++) 
        {
            if (arr[i] == arr[j]) 
            {
                printf("%d ", arr[i]);
                break;
            }
        }
    }

    printf("\n");
    return 0;
}