package kapitel7;

public class Person implements Comparable 
{
	String name;
	int age;
	
	Person(String n, int a)
	{
		name = n;
		age = a;
	}
	
	int getAge()
	{
		return age;
	}
	
	String getName()
	{
		return name;
	}
	
	@Override
	public int compareTo(Object o)
	{
		return getName().compareTo(((Person)o).getName());
	}
}

