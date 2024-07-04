package stud;

public class Palindrome
{
  public int palindrome(int arr[], int size)
  {
    int start = 0;
    int end = size - 1;

    // Loop till the middle of the array
    while (start < end)
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
}
/*
        Palindrome p = new Palindrome();
        int arr[] = {3, 2, 2, 3};
        int size = 4;

        if (p.palindrome(arr, size) == 1)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }

 */