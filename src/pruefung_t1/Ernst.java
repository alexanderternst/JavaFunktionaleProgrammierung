package pruefung_t1;

import java.util.function.Predicate;

public class Ernst {
    public static void main(String[] args) {
        Predicate<Integer> IstGerade = number -> number % 2 == 0;

        for (int x = 0; x <= 10; x++)
            System.out.println("Nummer: " + x + ", Gerade: " + IstGerade.test(x));
    }
}
