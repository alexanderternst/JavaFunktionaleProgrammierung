package lambda;

public class MitAnonymerKlasse implements Lebewesen{
    public static void main(String[] args) {
        // anonyme Klasse auf Interface aufgebaut
        Lebewesen benjamin = new Lebewesen() {
            @Override
            public void macheEtwas(String s) {
                System.out.println("Töröö" + s);
            }
        };

        benjamin.macheEtwas("!");
    }

    @Override
    public void macheEtwas(String s) {
        System.out.println("hi" + s);
    }
}
