#include<stdio.h>
int main()
{
    //Find a peak element which is not smaller than its neighbors
    // 1 5 2 3 4 == 4 5

    int array[5]={1,5,2,6,3};
    int i;

    if(array[0]>array[0+1])
    printf("%d ",array[0]);

    if(array[4]>array[4-1])
    printf("%d ",array[4]);

    for(i=0; i<5; i++)
    {
        if(array[i]>array[i-1] && array[i]>array[i+1])
        printf("%d ",array[i]);
    }

    return 0;
}