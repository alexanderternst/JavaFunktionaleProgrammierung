package kapitel7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Mehrstufig 
{
	public static void main(String[] args) 
	{
		ArrayList<Business> businesses = new ArrayList<>();
		businesses.add(new Business("Google", new ArrayList<Person>() {{
			add(new Person("Lara", 35));
			add(new Person("Peter", 21));
		}}));
		
		businesses.add(new Business("Apple", new ArrayList<Person>() {{
		   add(new Person("Zacharias", 45));
		   add(new Person("Amelie", 50));
		   add(new Person("Jürgen", 17));
		   add(new Person("Kathi", 16));
		}}));
	
		businesses.add(new Business("Amazon", new ArrayList<Person>() {{
			   add(new Person("Michael", 41));
			   add(new Person("Jessica", 28));
			   add(new Person("Laurenz", 13));
			}}));

		// erster Stream map
        // Abrufen der Namen der Unternehmen
		businesses
	    	.stream()
		    .map(b -> b.getName())
		    .forEach(System.out::println);
		
		// zweiter Stream flatMap
        // Speichern der Namen der Mitarbeiter der Firmen die mit dem Buchstaben A anfangen
		String names = businesses
		    .stream() 
		    .filter(b -> b.getName().startsWith("A"))
            // Kombiniert verschiedene Streams zu einem Stream
		    .flatMap(b -> b.getEmployees().stream())
		    .sorted()
//		    .filter(p -> p.getAge() >= 30)
		    .map(Person::getName)            // kurzform von .map(p -> p.getName())
		    .collect(Collectors.joining(","));
		
		System.out.println(names);
		
		// Zweiter Stream ohne die Stream-Technik
		ArrayList<Person> personList = new ArrayList<>();
        // Gehen durch jedes Business schauen ob es mit A anfängt wenn ja,
        // dann fügen wir die Employees in die Liste ein
		for(Business b : businesses)
		{
			// if(b.getName().startsWith("A"))
			// {
				personList.addAll(b.getEmployees());
			// }
		}
		
		personList.sort(Person::compareTo);
		
        // Alle Namen ausgeben
        String allNames = businesses
		    .stream() 
		    .flatMap(b -> b.getEmployees().stream())
		    .sorted()
		    .map(Person::getName)
		    .collect(Collectors.joining(","));

        System.out.println(allNames);

        // Alle Personen speichern die älter als 30 sind
		ArrayList<Person> olderThan30 = new ArrayList<>();
		for(Person p : personList)
		{
			if(p.getAge() >= 30)
			{
				olderThan30.add(p);
			}
		}
		
        // Speichern aller Namen der Personen die über 30 sind
		StringBuilder builder = new StringBuilder();
		for(Person p : olderThan30)
		{
			builder.append(p.getName() + ",");
		}
		
		String s2 = builder.substring(0, builder.length()-1);
		System.out.println(s2);
	}
}

class Business
{
	String name;
	ArrayList<Person> employees;
	
	public Business(String name, ArrayList<Person> employees)
	{
		this.name = name;
		this.employees = employees;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public ArrayList<Person> getEmployees()
	{
		return employees;
	}
}