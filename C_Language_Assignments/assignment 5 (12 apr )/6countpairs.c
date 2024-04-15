//Count Pairs with the given sum
// 1 2 3 4 -> sum: 3 -> pair: 1 2
#include<stdio.h>
int main()
{
    int arr[5]={1,2,3,4,5},sum,i,j,flag=0;

    printf("enter sum to find pair:");
    scanf("%d",&sum);

    for(i=0;i<5;i++)
    {
        for(j=1;j<5;j++)
        {
            if(arr[i]+arr[j]==sum)
            {
                printf("%d %d",i+1,j+1);
                printf("\n");
            }

        }
    }
    return 0;
}