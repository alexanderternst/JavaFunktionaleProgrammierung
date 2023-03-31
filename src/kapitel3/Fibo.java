package kapitel3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Fibo 
{
	static int anzahl;
	
	static IntToLongFunction fibFn = new IntToLongFunction()
	{
		Map<Integer, Long> cache = new HashMap<Integer, Long>();
		@Override
		public long applyAsLong(int n)
		{
			anzahl++;
			System.out.print(".");
			if (n== 0 || n == 1) return 1;
			Long fibN = cache.get(n);
			if(fibN == null)
			{
				fibN = this.applyAsLong(n-1) + this.applyAsLong(n-2);
				cache.put(n, fibN);
			}
			return fibN;
		}
	}	;
	
	static long fib(long n)
	{
		System.out.print(":");
		if (n==0 || n==1) return 1;
		else return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) 
	{
		long x = fib(7);
		System.out.println();
		System.out.println(x);
		
		x = fibFn.applyAsLong(7);   
		
		for(int i=1;i<13;i++)
		{
			 anzahl = 0;
		     x = fibFn.applyAsLong(7);
		     System.out.println(""+i+":  " + x + " Aufrufe: " + anzahl);
		}
	}
}

