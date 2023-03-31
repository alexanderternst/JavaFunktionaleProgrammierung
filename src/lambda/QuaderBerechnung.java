package lambda;

public class QuaderBerechnung {
    public static void main(String[] args){
        Quader kante = (laenge, breite, hoehe) -> laenge * 4 + breite * 4 + hoehe * 4;
        System.out.println(kante.berechnen(3, 4, 5));

        Quader flaeche = (laenge, breite, hoehe) -> laenge * breite * 2 + laenge * hoehe * 2 + breite * hoehe * 2;
        System.out.println(flaeche.berechnen(3, 4, 5));

        Quader volumen = (laenge, breite, hoehe) -> laenge * breite * hoehe;
        System.out.println(volumen.berechnen(3, 4, 5));
    }
}
