package kapitel7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class kamelFall 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Lara", 35));
		persons.add(new Person("Peter", 21));
		persons.add(new Person("Zacharias", 45));
		persons.add(new Person("Amelie", 50));
		persons.add(new Person("Jürgen", 17));
		persons.add(new Person("Kathi", 16));

        // Ohne Streams
        List<Person> minors = new ArrayList<>();
        for(Person p : persons)
        {
            if(p.getAge() < 18)
            {
                minors.add(p);
            }
        }
	
        // Mit Streams
        List<Person> minorsPerStream = persons
                .stream()
                .filter(p -> p.getAge() < 18)
                .collect(Collectors.toList());
	
        // Vergleich: Die Listen sind identisch	
        System.out.println(minors.equals(minorsPerStream));
        
        System.out.println("----------------- Ausgabe Personen mit Alter");
        
        // Ausgabe Personen mit Alter
        persons.stream()
//              .sorted((p1, p2) -> 
//                  p1.getName().compareTo(p2.getName()))   
                .sorted()
                // darstellung
                .map(p ->("" + p.getName() + " Alter:" + p.getAge()))
                .forEach(System.out::println);


        System.out.println("----------------- Ausgabe Minors");

        // Ausgabe Minors
        List<String> minorsLists = minorsPerStream.stream()
            .map(p -> p.getName())
            .collect(Collectors.toList());
        
        minorsLists.forEach(System.out::println);
	}
}