//Find the first repeating element in an array of integers
// 1 2 2 3 1-> first repeating element is 1
#include<stdio.h>
int main() 
{   
    int arr[10] = {1, 4, 2, 2, 3, 8, 8, 5, 3, 1};
    int i, j, found = 0;

    for (i = 0; i < 10; i++) 
    {
        for (j=i+1; j<10; j++)
        {
            if (arr[i] == arr[j]) 
            {
                found = 1; 
                printf("First repeating element is %d\n", arr[i]);
                break;
            }
        }
            if (found==1) 
            {
                break;
            }
    }

    if (found!=1) 
    {
        printf("No repeating element found\n");
    }
    
    return 0;
}