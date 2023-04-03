package s163;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.security.auth.login.FailedLoginException;

public class FamilienFerien 
{

	public static void main(String[] args) 
	{
		ArrayList<Familie> familien = new ArrayList();
		
		familien.add(new Familie("Meier",new Mensch("Fritz",1981),
                new Mensch("Pia", 1983),
                new ArrayList<Mensch>() {{
	     			add(new Mensch("Lara", 2011));
	          		add(new Mensch("Peter",2014));
	            }}));
				
		familien.add(new Familie("Pfluger",new Mensch("Lukas",1984),
                new Mensch("Rosa", 1987),
                new ArrayList<Mensch>() {{
        			add(new Mensch("Leila", 2013));
        			add(new Mensch("Monika",2014));
        			add(new Mensch("Thomas",2016));
                }}));

		familien.add(new Familie("Steiner",new Mensch("Heinrich",1984),
                new Mensch("Valerina", 1987),
                new ArrayList<Mensch>() {{
        			add(new Mensch("Lukas", 2011));
        			add(new Mensch("Hugo", 2013));
        			add(new Mensch("Andrea",2015));
        			add(new Mensch("Thomas",2016));
                }}));
		
		
		/*
		 * Aufgaben
		 * A) holen Sie alle Familiennamen in einen String mit Kommagetrennt 
		 * B) erstellen Sie eine Liste <Mensch> mit allen Kindern nach 2015 geboren
		 * C) erstellen Sie eine Liste <Mensch> mit allen Vätern
		 * D) Berechnen Sie das Durchschnittsalter alle Mütter
		 * E) Suchen Sie den Jahrgang des Ältesten Teilnehmers
		 * F) 
		 * 
		 */
		// A)
		String output = familien.
						stream().
						map(Familie::getName).
						collect(Collectors.joining(","));
		System.out.println(output);
		
		// B)
		List<Mensch> kinder = familien.
				stream().
				flatMap(b -> b.getKinder().stream()).
				filter(b -> b.getJahrgang() > 2015).
				collect(Collectors.toList());
		System.out.println("hello world");
		kinder.forEach(b -> System.out.println(b.getVorname()));

		// C)
		List<Mensch> vaeter = familien.
				stream().
				map(Familie::getVater).
				collect(Collectors.toList());
		vaeter.forEach(b -> System.out.println(b.getVorname()));

		// D)
		double durchschnittsalter = familien.
				stream().
				mapToDouble(b -> 2023 - b.getMutter().getJahrgang()).
				average().
				getAsDouble();
		System.out.println(durchschnittsalter);

		// E)
		// Suchen Sie den Jahrgang des Ältesten Teilnehmers der Eltern
		int x = familien.
				stream().
				flatMap((Familie p) -> Stream.of(p.getVater(), p.getMutter())).
				mapToInt(Mensch::getJahrgang).
				max().
				getAsInt();

		// F)
		List<Paar> paare = familien.
				stream().
				map((Familie p) -> new Paar(p.getVater(), p.getMutter())).
				collect(Collectors.toList());
		paare.forEach(b -> System.out.println(b.Mann.getVorname() + " " + b.Frau.getVorname()));

		System.out.println("-----------alle Kinder--in String------------------------");
		
		String names = familien
				.stream()
				.flatMap(b -> b.getKinder().stream())
			    .map(Mensch::getVorname)
			    .collect(Collectors.joining(","));
			
		System.out.println(names);
		
		System.out.println("-----------alle Kinder--in Liste------------------------");
		
		List<Mensch> allekinder = familien
				.stream()
				.flatMap(b -> b.getKinder().stream())
				.collect(Collectors.toList());
		
		allekinder
		.stream()
	    .map(Mensch::getVorname)
        .forEach(System.out::println);
	}

}
