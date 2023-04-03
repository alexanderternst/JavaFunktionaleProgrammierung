package s163;

public class Person implements Comparable
{
	String Vorname;
	int Groesse_cm;
	int Gewicht_kg;
	int Jahrgang;
	String Blut;            // 0 A B AB

	public Person(String vorname, int groesse_cm, 
			int gewicht_kg, int jahrgang, String blut) 
	{
		super();
		Vorname = vorname;
		Groesse_cm = groesse_cm;
		Gewicht_kg = gewicht_kg;
		Jahrgang = jahrgang;
		Blut = blut;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public int getGroesse_cm() {
		return Groesse_cm;
	}
	public void setGroesse_cm(int groesse_cm) {
		Groesse_cm = groesse_cm;
	}
	public int getGewicht_kg() {
		return Gewicht_kg;
	}
	public void setGewicht_kg(int gewicht_kg) {
		Gewicht_kg = gewicht_kg;
	}
	public int getJahrgang() {
		return Jahrgang;
	}
	public void setJahrgang(int jahrgang) {
		Jahrgang = jahrgang;
	}
	public String getBlut() {
		return Blut;
	}
	public void setBlut(String blut) {
		Blut = blut;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [Vorname=" + Vorname + ", Groesse_cm=" + Groesse_cm + ", Gewicht_kg=" + Gewicht_kg
				+ ", Jahrgang=" + Jahrgang + ", Blut=" + Blut + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		return getBlut().compareTo(((Person)o).getBlut());
	}
}

