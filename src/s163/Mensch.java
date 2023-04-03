package s163;

public class Mensch implements Comparable
{
	String Vorname;
	Integer Jahrgang;
	
	public Mensch(String vorname, Integer jahrgang) {
		super();
		Vorname = vorname;
		Jahrgang = jahrgang;
	}
	
	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public Integer getJahrgang() {
		return Jahrgang;
	}

	public void setJahrgang(Integer jahrgang) {
		Jahrgang = jahrgang;
	}

	@Override
	public int compareTo(Object o)
	{
		return getJahrgang().compareTo(((Mensch)o).getJahrgang());
	}
}

