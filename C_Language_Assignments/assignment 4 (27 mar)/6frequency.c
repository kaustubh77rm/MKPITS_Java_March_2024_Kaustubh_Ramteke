#include <stdio.h>
int main() 
{
    int arr[100], freq[100], n, i, j, count;

    printf("Enter size: ");
    scanf("%d", &n);

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) 
    {
        scanf("%d", &arr[i]);
    }
    // Initialize frequency array with 0 (all elements appear 0 times initially)
    for (i = 0; i < n; i++) 
    {
        freq[i] = 0;
    }
    // Count frequency of each element
    for (i = 0; i < n; i++) 
    {
        count = 1;  // initialize count for the current element
        for (j = i + 1; j < n; j++) 
        {
            if (arr[i] == arr[j]) 
            {
                count++;  // increment count if duplicate found
                freq[j] = -1;  // mark visited elements (to avoid counting again)
            }
        }

        // If the element hasn't been marked as visited before, store its frequency
        if (freq[i] != -1) 
        {
            freq[i] = count;
        }
    }
    // Print the frequency of each element
    printf("\nFrequency of each element:\n");
    for (i = 0; i < n; i++) 
    {
        if (freq[i] > 0) 
        {  // Print only elements that appeared at least once
            printf("%d: %d \n", arr[i], freq[i]);
        }
    }
    return 0;
}