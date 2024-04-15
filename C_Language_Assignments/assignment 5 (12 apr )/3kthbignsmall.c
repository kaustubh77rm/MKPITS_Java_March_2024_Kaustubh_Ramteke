//Find the Kth largest and Kth smallest number in an array	
#include<stdio.h>
main()
{
int arr[10]={10,5,1,2,4,9,6,7,8,3}; 
//1,2,3,4,5,6,7,8,9,10
//2nd smallest 2, 2nd biggest 9
int i,j,temp,search,swapped,smallest,biggest;
    for(i=0; i<10; i++)
    {
        for(j=0; j<10; j++)
        {
         if(arr[i]<arr[j])
         {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             swapped=1;
         }
         if(swapped==0)
         {
             break;
         }
        }
    }

    printf("enter n'th biggest/smallest number to find:");
    scanf("%d",&search);

    smallest= arr[search-1];
    biggest= arr[10-search];

    printf("%dth smallest:%d\n%dth biggest:%d",search,smallest,search,biggest);
}