//Count the number of occurances of numbers in an arrray of integers
#include<stdio.h>
void occurrence();
int main()
{
    occurrence();
    return 0;
}

void occurrence() 
{
    int arr[5]={1,1,2,2,3}, i, j;

    for (i=0; i<5; i++)
    {
        int count=0, alreadyCounted=0;
        
        for (j=0; j<i; j++)
        {
            if (arr[j] == arr[i])
            {
                alreadyCounted = 1;
                break;
            }
        }
        // If not, count its occurrences
        if(alreadyCounted!=1)
        {
                for (j=0; j<5; j++) 
                {
                    if (arr[i] == arr[j])
                    count++;
                }
            printf("%d occured %d times\n", arr[i], count);
        }
    }
}
