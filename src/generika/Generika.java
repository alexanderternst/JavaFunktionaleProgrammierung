package generika;

public class Generika {
    public static void main(String[] args) {
        String[] namen = {"Hans", "Peter", "Klaus"};
        Integer[] zahlen = {1, 2, 3, 4, 5};
        Double[] zahlen2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] buchstaben = {'a', 'b', 'c', 'd', 'e'};
        Boolean[] wahrOderFalsch = {true, false, true, false, true};
        auslesen(namen);
        auslesen(zahlen);
        auslesen(zahlen2);
        auslesen(buchstaben);
        auslesen(wahrOderFalsch);
    }

    public static <T> void auslesen(T[] array) {
        for (T element : array) {
            System.out.print("" + element);
            System.out.println(" " + element.getClass());
        }
    }
}
