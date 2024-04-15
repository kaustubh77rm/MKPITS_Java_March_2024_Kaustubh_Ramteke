#include <stdio.h>
void rotate(int arr[], int n, int d) 
{
  /* Handling negative or d greater than n */
  d = d % n;
  if (d == 0) return;

  /* Reversal approach */
  int i, temp;
  // Reverse first d elements
  for (i = 0; i < d / 2; i++) 
  {
    temp = arr[i];
    arr[i] = arr[d - i - 1];
    arr[d - i - 1] = temp;
  }
  // Reverse remaining elements
  for (i = d; i < (n + d) / 2; i++) 
  {
    temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
  }

void printArray(int arr[], int n) 
{
  for (int i = 0; i < n; i++) 
  {
    printf("%d ", arr[i]);
  }
  printf("\n");
}

int main() 
{
  int arr[] = {1, 2, 3, 4, 5, 6, 7};
  int n = sizeof(arr) / sizeof(arr[0]);
  int d = 2;  // Number of positions to rotate by

  printf("Original array: ");
  printArray(arr, n);

  rotate(arr, n, d);

  printf("Rotated array: ");
  printArray(arr, n);

  return 0;
}