package vordefiniert;

import java.util.function.Consumer;

public class Konsument {
    public static void main(String[] args){
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hallo");

        Consumer<Object> Objektanalyse = x -> System.out.println(x.getClass());
        String x = "JavaFunktional";
        Objektanalyse.accept(x);
        Objektanalyse.accept(3.14);
        Objektanalyse.accept(false);
    }
}
