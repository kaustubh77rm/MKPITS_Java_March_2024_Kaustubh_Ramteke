#include <stdio.h>
#include <conio.h>
int main() {
    int pin, choice, amount;
    float balance = 1000.00; // Initial balance

    clrscr();
    printf("Welcome to the ATM\n");

    // Get user PIN
    printf("Enter your PIN: ");
    scanf("%d", &pin);

    // Verify PIN
    if (pin != 1234) { // Replace 1234 with your desired PIN
        printf("Invalid PIN\n");
        return 1;
    }

    printf("Hello! Choose an option:\n");
    printf("1. Check Balance\n");
    printf("2. Withdraw Cash\n");
    printf("3. Deposit Cash\n");
    printf("4. Exit\n");

    scanf("%d", &choice);

    if (choice == 1) {
        printf("Your current balance is: %.2f\n", balance);
    } else if (choice == 2) {
        printf("Enter amount to withdraw: ");
        scanf("%d", &amount);

	if (amount > balance)
	{
	    printf("Insufficient funds\n");
	}
	 else if (amount % 100 != 0)
	 {
	    printf("Please withdraw in multiples of $100\n");
	}
	else
	{
	    balance -= amount;
	    printf("Please collect your cash\n");
	    printf("Remaining balance: %.2f\n", balance);
	}
    }
    else if (choice == 3)
    {
	printf("Enter amount to deposit: ");
	scanf("%d", &amount);

	balance += amount;
	printf("Deposit successful\n");
	printf("New balance: %.2f\n", balance);
    }
	else if (choice == 4) {
	printf("Thank you for using the ATM. Goodbye!\n");
    } else {
	printf("Invalid choice\n");
    }
    getch();
    return 0;
}
