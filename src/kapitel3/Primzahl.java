package kapitel3;

public class Primzahl 
{
	static boolean isPrime(long n)
	{
        // Hinter Wurzel wird alles zu gross, deshalb suchen wir nur vor der Wurzel der Zahl
        // Wenn Zahl durch Wurzel teilbar ist, dann ist Sie keine Primzahl
        // Deshalb müssen wir nach der Wurzel nicht mehr suchen
		for(int i=2;i*i <=n;i++)
		{
            System.out.println("i: " + i + " n/i: " + n/i + " n%i: " + n%i);
            // Wenn Rest 0, dann ist n durch i teilbar und somit keine Primzahl
			if(n%i==0) return false;
		}
        // Wenn Rest nicht 0, dann ist n nicht durch i teilbar und somit eine Primzahl
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(isPrime(21467));
	}

    //num%2 = 0 (rest) => num is even
}

