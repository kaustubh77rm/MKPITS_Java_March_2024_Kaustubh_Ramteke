//Find the Union and Intersection of the two sorted arrays
#include <stdio.h>

int main() {
    int arr1[4] = {1, 2, 3, 4};
    int arr2[4] = {3, 4, 5, 6};
    int i, j, k;
    int union_count = 0, intersection_count = 0;
    int union_arr[10], intersection_arr[10];

    // Intersection
    for (i = 0; i < 4; i++) 
    {
        for (j = 0; j < 4; j++) 
        {
            if (arr1[i] == arr2[j]) 
            {
                intersection_arr[intersection_count++] = arr1[i];
                break;
            }
        }
    }

    // Union
    for (i = 0; i < 4; i++) 
    {
        int found = 0;
        for (j = 0; j < union_count; j++) 
        {
            if (arr1[i] == union_arr[j]) 
            {
                found = 1;
                break;
            }
        }
        if (found!=1) 
        {
            union_arr[union_count++] = arr1[i];
        }
    }
    for (i = 0; i < 4; i++) 
    {
        int found = 0;
        for (j = 0; j < 4; j++) 
        {
            if (arr2[i] == union_arr[j]) 
            {
                found = 1;
                break;
            }
        }
        if (found==1) 
        {
            union_arr[union_count++] = arr2[i];
        }
    }

    printf("Intersection: ");
    for (i=0; i<intersection_count; i++) 
    {
        printf("%d ", intersection_arr[i]);
    }
    printf("\n");

    printf("Union: ");
    for (i=0; i<union_count; i++) 
    {
        printf("%d ", union_arr[i]);
    }
    printf("\n");

    return 0;
}