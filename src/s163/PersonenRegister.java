package s163;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class PersonenRegister {

	public static void main(String[] args) 
	{
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Lara", 167,67,1988, "A"));
		persons.add(new Person("Peter", 188,88,1989, "0"));
		persons.add(new Person("Zacharias", 202,92,1991, "B"));
		persons.add(new Person("Amelie", 174,55,2000, "AB"));
		persons.add(new Person("Jürgen", 169,61,1999, "B"));
		persons.add(new Person("Kathi", 175, 71, 1974, "0"));
		persons.add(new Person("Larua", 169,69,1998, "AB"));
		persons.add(new Person("Pedro", 181,81,1981, "0"));
		persons.add(new Person("Zack", 179,83,1983, "B"));
		persons.add(new Person("Anna", 171,65,2003, "0"));
		persons.add(new Person("Jürg", 185,85,1985, "B"));
		persons.add(new Person("Karin", 171, 73, 1975, "A"));
		
		persons.forEach(p -> System.out.println(p.toString()));
		System.out.println("----------------------------------");	
		System.out.println("-------------sortier Nach Blutgruppe---------------------");	
		
		List<Person> AllPerStream = persons
				.stream()
				.sorted(Comparator.comparing(Person::getVorname))
				.collect(Collectors .toList());

		AllPerStream.forEach(p -> System.out.println(p.toString()));

		
        System.out.println("----------------------------------");
        
		List<Person> APerStream = persons
				.stream()
				.filter(p -> p.getBlut().equals("A"))
				.collect(Collectors.toList());
	
		APerStream.forEach(p -> System.out.println(p.getVorname()));
		System.out.println("----------------------------------");	
		
		
		
		List<PersonBMI> BMIPerStream = persons
				.stream()
				.map((Person p)  -> new PersonBMI(p.getVorname(), 
				   (p.getGewicht_kg() / (double) (p.getGroesse_cm() / 100.0 * p.getGroesse_cm() / 100.0))))
				.collect(Collectors.toList());
	
		BMIPerStream
			.stream()
	        .map(p -> p.getVorname() + " BMI:" + p.getBMI())
            .forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		
		// finde den ersten mit AB
		Person Per2;
		
		Optional<Person> Per = persons
				.stream()
				.filter(p -> p.getBlut().equals("AB"))
				.findFirst();
		
		System.out.println(Per.getClass());
		Per2 = Per.get();
        
		
		System.out.println(Per2.Blut);           // Siehe Seite 42
		
		System.out.println("----------------------------------");
	}
}

