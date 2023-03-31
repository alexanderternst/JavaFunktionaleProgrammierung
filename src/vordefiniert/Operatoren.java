package vordefiniert;

import java.util.function.*;

public class Operatoren {
    public static void main(String[] args) {
        // Generics Operator - 2 Parameter
        BinaryOperator<Integer> add = (x, y) -> x + y;
        BinaryOperator<String> concat = (x, y) -> x + y;
        // Generics Operator - 1 Parameter
        UnaryOperator<Integer> square = x -> x * x;
        // Spezifischer Operator - 2 Parameter
        DoubleBinaryOperator mul = (x, y) -> x * y;

        System.out.println("Addition: " + add.apply(1, 2));
        System.out.println("Concat String: " + concat.apply("1", "2"));
        System.out.println("Square: " + square.apply(2));
        System.out.println("Multiplication: " + mul.applyAsDouble(1.0, 2.0));
    }
}
