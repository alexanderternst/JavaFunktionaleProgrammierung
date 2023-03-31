package lambda;


public class KreisKugelRechner {
    public static void main (String[] args){
        KreisKugel durchmesser = (radius) -> radius * 2;
        KreisKugel umfang = (radius) -> radius * 2 * Math.PI;
        KreisKugel flaeche = (radius) -> radius * radius * Math.PI;
        KreisKugel oberflaeche = (radius) -> 4.0 * Math.PI * radius * radius;
        KreisKugel volumen = (radius) -> 4.0 / 3.0 * Math.PI * radius * radius * radius;

        System.out.println("Durchmesser: " + durchmesser.berechnen(3));
        System.out.println("Umfang: " + umfang.berechnen(3));
        System.out.println("Fläche: " + flaeche.berechnen(3));
        System.out.println("Oberfläche: " + oberflaeche.berechnen(3));
        System.out.println("Volumen: " + volumen.berechnen(3));
    }
}
