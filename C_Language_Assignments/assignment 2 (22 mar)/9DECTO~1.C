#include <stdio.h>
int main() 
{
    int decimal, remainder, binary = 0, i = 1;

    printf("Enter a decimal number: ");
    scanf("%d", &decimal);

    // Handle negative numbers (optional)
    if (decimal < 0) 
    {
        printf("Error: Cannot convert negative numbers to binary.\n");
        return 1;
    }

    // Convert decimal to binary
    while (decimal != 0) 
    {
        remainder = decimal % 2;
        binary = binary + (remainder * i);
        decimal /= 2;
        i *= 10;  // Multiply by 10 to place digits correctly
    }

    printf("binary: %d\n",binary);

    return 0;
}
