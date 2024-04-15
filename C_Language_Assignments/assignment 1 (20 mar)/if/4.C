#include <stdio.h>
int main() 
{ 
  float purchaseAmount;
  
  // Get purchase amount from user
  printf("Enter your total purchase amount: rs");
  scanf("%f", &purchaseAmount);

  // Check for discount eligibility
    if (purchaseAmount >= 1000)
    {
    printf("Congratulations! You qualify for a 10%% discount.\n");
    }
    else if (purchaseAmount >= 500)
    {
    printf("Congratulations! You qualify for a 5%% discount.\n");
    }
    else
    {
    printf("Thank you for your purchase. No discount applies at this time.\n");
    }
   
   return 0;
}
