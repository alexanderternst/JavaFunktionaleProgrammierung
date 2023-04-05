package schlusstest;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.List;

public class HotelKette {

    public static void main(String[] args) 
	{
		ArrayList<Hotel> hotelkette = new ArrayList();
		
		hotelkette.add(new Hotel("Sunset",4,new ArrayList<Zimmer>()
		{{
			add(new Zimmer(1201,0,1,true,false,false));
			add(new Zimmer(1202,3,0,false,false,false));
			add(new Zimmer(1203,0,1,true,false,false));
			add(new Zimmer(1204,3,0,false,true,true));
			add(new Zimmer(1301,1,0,true,false,false));
			add(new Zimmer(1302,3,0,false,false,false));
			add(new Zimmer(1303,0,1,true,false,false));
			add(new Zimmer(1304,1,1,true,true,true));
		}}  ));
		
		hotelkette.add(new Hotel("Sunday",3,new ArrayList<Zimmer>()
		{{
			add(new Zimmer(2101,0,1,true,false,false));
			add(new Zimmer(2102,2,0,false,false,false));
			add(new Zimmer(2103,0,1,true,false,false));
			add(new Zimmer(2104,2,0,false,true,true));
			add(new Zimmer(2201,0,1,true,false,false));
			add(new Zimmer(2202,2,0,false,false,false));
			add(new Zimmer(2203,0,1,true,false,false));
			add(new Zimmer(2204,2,0,false,true,false));
		}}  ));
		
		hotelkette.add(new Hotel("Sunside",2,new ArrayList<Zimmer>()
		{{
			add(new Zimmer(3301,0,1,true,false,false));
			add(new Zimmer(3302,3,0,false,false,false));
			add(new Zimmer(3303,0,1,true,false,false));
			add(new Zimmer(3304,3,0,false,true,true));
			add(new Zimmer(3401,1,0,true,false,false));
			add(new Zimmer(3402,3,0,false,false,false));
			add(new Zimmer(3403,0,1,true,false,false));
			add(new Zimmer(3404,1,1,true,true,false));
			add(new Zimmer(3432,1,2,true,true,true));
		}}  ));

		System.out.println("-----------------Hier Aufgaben A-F lösen---------------------------");

        System.out.println("--- Aufgabe A ---");
        // A) Erstellen Sie einen String Kommagetrentt von allen Hotels
        String Kommagetrennt = hotelkette.stream().
                                map(hotel -> hotel.getName()).
                                collect(Collectors.joining(", "));
		System.out.println(Kommagetrennt);
        
        System.out.println("--- Aufgabe B ---");
        // B) Zählen Sie die gesammt Kapazität (Betten) aller drei Hotels mit Terminal-Operation-Reduktion sum
        int gesamtKapazitaet = hotelkette.stream()
            .flatMap(hotel -> hotel.getZimmer().stream())
            .mapToInt(zimmer -> zimmer.getEinzelbett() + zimmer.getDoppelbett() * 2)
            .sum();
        System.out.println(gesamtKapazitaet);

        System.out.println("--- Aufgabe C ---");
        // C) Listen Sie die Zimmernummern der Einzelzimmer auf
        List<Integer> Einzelzimmer = hotelkette.stream()
            .flatMap(hotel -> hotel.getZimmer().stream())
            .filter(zimmer -> zimmer.getEinzelbett() == 1 && zimmer.getDoppelbett() == 0)
            .map(zimmer -> zimmer.getNr())
            .collect(Collectors.toList());
        Einzelzimmer.forEach(System.out::println);

        System.out.println("--- Aufgabe D ---");
        // D) Kreieren sie eine Klasse mit den Eigenschaften Hotelname, Zimmernummer, Kapazität mit Namen ZimmerKompakt
        // Machen Sie aus dieser Klasse eine Liste und befüllen Sie diese
        List<ZimmerKompakt> zikom = hotelkette.stream()
            .flatMap(f -> 
                    f.getZimmer().stream()
                        .map(k -> 
                    (new ZimmerKompakt(f.getName(), k.getNr(), k.getKap()))))
                    .collect(Collectors.toList());
        zikom.forEach(p -> System.out.println(p.getHotelname() + " ZiNr " + p.getNr() + " " + p.getMaxBelegung()));
		
        System.out.println("--- Aufgabe E ---");
        // E) Filtern Sie die Zimmer aus zikom in eine Liste zikom3plus welche alle Zimmer enthält welche 3 oder mehr Betten haben.
        List<ZimmerKompakt> zikom3plus = zikom.stream()
            .filter(z -> z.getMaxBelegung() >= 3)
            .collect(Collectors.toList());
        zikom3plus.forEach(p -> System.out.println(p.getHotelname() + " ZiNr " + p.getNr() + " " + p.getMaxBelegung()));

        System.out.println("--- Aufgabe F ---");
        // F) Erstellen Sie eine Liste aller Zimmer mit Namnen wcgang die weder Bad noch Dusche haben und geben Sie diese Zimmernummern aus
        List<Integer> wcgang = hotelkette.stream()
            .flatMap(hotel -> hotel.getZimmer().stream())
            .filter(zimmer -> zimmer.isBad() == false && zimmer.isDusche() == false)
            .map(zimmer -> zimmer.getNr())
            .collect(Collectors.toList());
        wcgang.forEach(System.out::println);

	} // Ende Main
} // Ende Hotelkette