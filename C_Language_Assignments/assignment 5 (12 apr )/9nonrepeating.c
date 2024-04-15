#include<stdio.h>
int main() 
{
    int arr[10] = {1, 1, 2, 2, 3, 8, 8, 5, 3, 1};
    int i, j;
    int found = 0;

    for (i=0; i<10; i++) 
    {
        found = 0;
        for (j=0; j<10; j++) 
        {
            if (i!=j && arr[i] == arr[j]) 
            {
                found = 1;
                break;
            }
        }
        if (found!=1) 
        {
            printf("First non-repeating element is %d\n", arr[i]);
            break;
        }
    }

    if (found==1)
        printf("No non-repeating element found\n");

    return 0;
}