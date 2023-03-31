package pruefung_t1;

public class Alexander {
    public static void main(String[] args) {
        Zylinder volumen = (radius, hoehe) -> radius * radius * Math.PI * hoehe;
        Zylinder oberflaeche = (radius, hoehe) -> radius * radius * Math.PI * 2 + 2 * radius * Math.PI * hoehe;
        Zylinder kantenlaenge = (radius, hoehe) -> 4 * radius * Math.PI;
        
        System.out.println("Volumen: " + volumen.rechnen(2.2, 1.7));
        System.out.println("Oberfläche: " + oberflaeche.rechnen(2.2, 1.7));
        System.out.println("Kantenlänge: " + kantenlaenge.rechnen(2.2, 1.7));
    }    
}
