package vordefiniert;

import java.util.function.Supplier;

public class Lieferant {
    public static void main(String[] args) {
        Supplier<Double> random1000 = () -> Math.random() * 1000;
        System.out.println(random1000.get());
    }
}
