package vordefiniert;

import java.util.function.DoubleFunction;

public class Funktionen {
    public static void main (String[] args){

        DoubleFunction<Double> KreisUmfang = r -> r * 2 * Math.PI;
        DoubleFunction<Double> Kugelvolumen = r -> 4.0 / 3.0 * Math.PI * r * r * r;
        System.out.println("KreisUmfang: " + KreisUmfang.apply(2.2));
        System.out.println("Kugelvolumen: " + Kugelvolumen.apply(2.2));
        // Volumen einer Box wenn Kugel in Box währe, 2.2 ist der Radius der Kugel
        // 4.4 ist der Durchmesser der Kugel
        // 4.4 * 4.4 * 4.4 ist der Volumen der Box
        System.out.println("Volumen einer Box wenn Kugel in Box währe: " + 4.4 * 4.4 * 4.4);
    }
}
