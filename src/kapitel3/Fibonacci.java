package kapitel3;

public class Fibonacci 
{
	// Initialize a static variable "Anzahl" with value 0
	static int Anzahl = 0;
	
	// A recursive method "fib" that returns the n-th Fibonacci number
	// It takes a long integer n as input parameter
	static long fib(long n)
	{
		// Increment the "Anzahl" variable by 1 for each call to "fib" method
		Anzahl++;
		
		// Base case: If n is 0 or 1, return 1
		if (n == 0 || n == 1) {
			return 1;
		}
		// Recursive case: Return the sum of (n-1)th and (n-2)th Fibonacci numbers
		else {
			return fib(n-1) + fib(n-2);
		}
	}

	// The main method
	public static void main(String[] args) 
	{
		// Loop through the first 12 Fibonacci numbers and print each number and the number of calls to "fib" method
		for(int i = 1; i < 13; i++)
		{
			// Set "Anzahl" to 0 for each iteration of the loop
			Anzahl = 0;
			
			// Call the "fib" method with the current value of "i" and store the result in "x"
			long x = fib(i);
			
			// Print the current value of "i", the value of "x", and the number of calls to "fib" method
			System.out.println("" + i + ": " + x + " Aufrufe: " + Anzahl);
		}
	}
}

