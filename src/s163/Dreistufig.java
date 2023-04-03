package s163;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dreistufig 
{

	public static void main(String[] args) 
	{
		ArrayList<Land> kantone = new ArrayList<Land>();
		
		//ArrayList<Gemeinde> gemeinden = new ArrayList<Gemeinde>(); 

		Bund mySchweiz = new Bund("Schweiz","CH",".ch", kantone);
		
		kantone.add(new Land("Aargau","AG", new ArrayList<Gemeinde>() {{
					   add(new Gemeinde("Aarau", "AAR", 12, 21773));
					   add(new Gemeinde("Baden", "BAD", 13, 19634));
		}}));
		
		kantone.add(new Land("Bern","BE", new ArrayList<Gemeinde>() {{
			   add(new Gemeinde("Bern", "BRN", 62, 134290));
			   add(new Gemeinde("Thun", "THU", 22, 41630));
			   add(new Gemeinde("Köniz", "KNZ", 51, 42177));
        }}));
		
		kantone.add(new Land("Zuerich","ZH", new ArrayList<Gemeinde>() {{
			   add(new Gemeinde("Zuerich", "ZRH", 88, 423193));
			   add(new Gemeinde("Winterthur", "WIN", 68, 115129));
			   add(new Gemeinde("Kloten", "KTN", 19, 20779));
     }}));
		
		
		//--------------------------------------------
		kantone 
    	.stream()
	    .map(b -> b.getName())
	    .forEach(System.out::println);	
		
		//--------------------------------------------
		
		String x = kantone
		.stream()
	    .flatMap(b -> b.getGemeinden().stream())
	    .map(Gemeinde::getName)            // kurzform von .map(p -> p.getName())
	    .collect(Collectors.joining(","));
		// 
		System.out.println(x);
		//--------------------------------------------
		

		int summe = mySchweiz.laender
		.stream()
	    .flatMap(b -> b.getGemeinden().stream())
		.mapToInt(b -> b.getKm2())
		.sum();

		System.out.println(summe);
		
		
		//--------------------------------------------
		mySchweiz.laender
		.stream()
		.forEach(b -> System.out.println(b.getName()));
		
		double mittel = mySchweiz.laender
		.stream()
	    .flatMap(b -> b.getGemeinden().stream())
		.mapToInt(b -> b.getBev())
		.average()
		.getAsDouble();

		System.out.println(mittel);

		//--------------------------------------------

		
		int summe2 = mySchweiz.laender
				.stream()
			    .flatMap(b -> b.getGemeinden().stream())
				.mapToInt(b ->b.getKm2())
				.sum();

		//--------------------------------------------
		
		int summe3 = mySchweiz.laender
				
				   .stream()
				   .flatMap(b -> b.getGemeinden().stream())
   				   .mapToInt(b ->b.getKm2())
				   .reduce(
				       0,
				       (a, b) -> a + b);

		System.out.println("summe2: " + summe2 + "   summe3: " + summe3);
		
		//--------------------------------------------

		String alleNamen = mySchweiz.laender
				
				   .stream()
				   .flatMap(b -> b.getGemeinden().stream())
                   //.dropWhile(b -> b.getBev() < 100000)
                   .takeWhile(b -> b.getBev() < 400000)
				   .map(b -> b.getName())
                   //.limit(3)
  			       .collect(Collectors.joining(","));
		
		System.out.println(alleNamen);
//		--------------------------------------------
	}

}
