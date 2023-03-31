package lambda;

public class Rechner {
    public static void main(String[] args) {
        Rechne addieren = (op1, op2) -> op1 + op2;
        System.out.println(addieren.kalku(3.5, 4.5));

        Rechne multiplizieren = (op1, op2) -> op1 * op2;
        System.out.println(multiplizieren.kalku(3.5, 4.5));

        Rechne dividieren = (op1, op2) -> op1 / op2;
        System.out.println(dividieren.kalku(3.5, 4.5));

        Rechne subtrahieren = (op1, op2) -> op1 - op2;
        System.out.println(subtrahieren.kalku(3.5, 4.5));
    }
}
