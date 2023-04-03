package s163;

public class PersonBMI 
{
	String Vorname;
	double BMI;
	
	public PersonBMI(String vorname, double bMI) 
	{
		super();
		Vorname = vorname;
		BMI = bMI;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public double getBMI() {
		return BMI;
	}

	public void setBMI(double bMI) {
		BMI = bMI;
	}
}