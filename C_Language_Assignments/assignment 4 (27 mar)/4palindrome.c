#include <stdio.h>
int palindrome(int arr[], int size) //return type with parameters
{
  int start = 0;
  int end = size - 1;

  // Loop till the middle of the array
  while (start<end) 
  {
    if (arr[start] != arr[end]) 
    {
      return 0; // Not a palindrome
    }
    start++;
    end--;
  }
  return 1; // Palindrome
}

int main() 
{
  int arr[] = {1, 2, 2, 1};
  int size = sizeof(arr) / sizeof(arr[0]);

  if (palindrome(arr, size)) 
  {
    printf("array is a palindrome\n");
  } 
  else 
  {
    printf("array is not a palindrome\n");
  }

  return 0;
}