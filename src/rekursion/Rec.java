package rekursion;

public class Rec {
	// Iteration: 1 * 2 * 3 * 4
	static long facIter(long n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
			System.out.println(i + ":" + result);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(facRec(20));
		System.out.println(facIter(20));
	}

	// Umgekehrte Reihenfolge: 4 * 3 * 2 * 1
	static long facRec(long n) {
		if (n == 1)
			return n;
		else
			return n * facRec(n - 1);
	}

}
