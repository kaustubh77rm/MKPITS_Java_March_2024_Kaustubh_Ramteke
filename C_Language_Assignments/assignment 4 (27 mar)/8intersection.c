#include <stdio.h>
void intersection_for(int arr1[], int size1, int arr2[], int size2) 
{
  printf("Intersection using nested loops:\n");
  int found=0;
  for (int i=0; i<size1; i++) 
  {
    for (int j = 0; j < size2; j++) 
    {
      if (arr1[i] == arr2[j]) 
      {
        found = 1;
        break;
      }
    }
    if (found) 
    {
      printf("%d ", arr1[i]);
      found = 0;
    }
  }
  printf("\n");
}
int main() 
{
  int arr1[] = {1, 2, 3, 4, 5};
  int size1 = sizeof(arr1) / sizeof(arr1[0]);
  int arr2[] = {3, 4, 5, 6, 7};
  int size2 = sizeof(arr2) / sizeof(arr2[0]);

  intersection_for(arr1, size1, arr2, size2);
  return 0;
}