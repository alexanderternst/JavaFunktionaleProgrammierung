package kapitel3;

public class Fibonacci 
{
		static int Anzahl = 0;
		static long fib(long n)
		{
			Anzahl++;
			if (n==0 || n==1) return 1;
			else return fib(n-1) + fib(n-2);
		}

		public static void main(String[] args) 
		{
			for(int i=1;i<13;i++)
			{
				 Anzahl = 0;
			     long x = fib(i);
			     System.out.println(""+i+":  " + x + " Aufrufe: " + Anzahl);
			}
		}
}
