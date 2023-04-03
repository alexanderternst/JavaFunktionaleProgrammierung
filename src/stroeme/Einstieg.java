package stroeme;

import java.util.Arrays;

public class Einstieg
{
	public static void main(String[] args)
	{
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Arrays.stream(numbers)
				// .sorted()
				// .limit(5)
				// .forEach(System.out::println);
				.forEach(x -> System.out.println(x));
		int sum = Arrays.stream(numbers)
				.reduce(0, (x, y) -> x + y);
		// .max().getAsInt();

		System.out.println("Summe der Zahlen: " + sum);

		double mittel = Arrays.stream(numbers)
				.average().getAsDouble();

		System.out.println("Durschnitt: " + mittel);

		int max = Arrays.stream(numbers)
				.max().getAsInt();

		System.out.println("Max: " + max);

	}

}
