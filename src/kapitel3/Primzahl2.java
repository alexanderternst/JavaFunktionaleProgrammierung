package kapitel3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Primzahl2 
{
	static boolean isPrime(long n)
	{
		for(int i=2;i*i <=n;i++)
		{
			if(n%i==0) return false;
		}
		return true;
	}
	
	static <T,R> Function<T,R> memoize(Function<T,R> fn)
	{
		final Map<T,R> cache = new HashMap<T,R>();
		return t -> 
		{
			R r = cache.get(t);
			if(r==null) 
			{
				r = fn.apply(t);
				cache.put(t,r);
				System.out.println("neu");
				
			}
			else
			{
				System.out.println("bestehend");
			}
			return r;
		};
	}

	public static void main(String[] args) 
	{
		Function<Long, Boolean> isPrimeWithMemo = memoize(n  -> isPrime(n));
		Long i = (long) 21467;
	    boolean x ;
	    x = isPrimeWithMemo.apply(i);                                      
	    System.out.println(x);
	    x = isPrimeWithMemo.apply(i);                                      
	}
}

