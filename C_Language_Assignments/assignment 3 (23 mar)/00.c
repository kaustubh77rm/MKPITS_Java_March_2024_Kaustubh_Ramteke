// C Program to implement call by value 
#include <stdio.h>
#include <math.h> 
// Call by value 
int sum(int x, int y) 
{ 
	int c; 
	c = x + y; 

	// Integer value retured 
	return c; 
} 

// Driver Code 
int main() 
{ 
	// Integer Declared 
	int a = 3, b = 2, c; 
	// Function Called 
	c = sum(a, b); 
	printf("Sum of %d & %d is %d", a, b, c); 
    
	return 0; 
}
