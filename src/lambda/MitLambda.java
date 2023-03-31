package lambda;

public class MitLambda {
    public static void main(String[] args) {
        // Lambda auf Interface aufgebaut
        Lebewesen benjamin = (String s) -> System.out.println("Töröö" + s);
        Lebewesen benjamin2 = (String s) -> {
            System.out.println("Töröö" + s);
            System.out.println("Töröö" + s);
        };

        benjamin.macheEtwas("!");
        benjamin2.macheEtwas("!");
    }
}
