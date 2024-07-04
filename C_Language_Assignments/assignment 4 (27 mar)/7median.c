#include <stdio.h>
void swap(int *a, int *b) 
{
  int temp = *a;
  *a = *b;
  *b = temp;
}
void selectionSort(int arr[], int n) 
{
  int i, j, minidx;

  // One by one move boundary of unsorted subarray
  for (i = 0; i < n - 1; i++) 
  {
    // Find the minimum element in unsorted array
    minidx = i;
    for (j = i + 1; j < n; j++)
      if (arr[j] < arr[minidx])
        minidx = j;

    // Swap the found minimum element with the first element
    swap(&arr[minidx], &arr[i]);
  }
}

float findmedian(int arr[], int n) 
{
  // Sort the array
  selectionSort(arr, n);

  // If number of elements are even
  if (n % 2 == 0) 
  {
    return (float)(arr[n/2-1] + arr[n/2])/2;
  } 
   else 
   {
     // If number of elements are odd
     return (float)arr[n/2];
   }
}
int main() 
{
  int size, i;

  printf("Enter the size of the array: ");
  scanf("%d", &size);

  int arr[size];

  printf("Enter %d elements for the array:\n", size);
  for (i = 0; i < size; i++)
   {
     scanf("%d", &arr[i]);
   }

  float median = findmedian(arr, size);

  printf("Median of the array: %.2f\n", median);

  return 0;
}