package stroeme;

import java.util.Arrays;

public class Einstieg {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Arrays.stream(numbers)
				.sorted()
				.limit(5)
				// .forEach(x -> System.out.println(x));
				.forEach(System.out::println);

		int sum = Arrays.stream(numbers)
				.reduce(0, (x, y) -> x + y);
		System.out.println(sum);
	}
}