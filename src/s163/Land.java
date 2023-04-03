package s163;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Land 
{
	String name;              // CH Kanton
	String kurz;
	
	
	ArrayList<Gemeinde> gemeinden;
	
	public Land(String name, String k, ArrayList<Gemeinde> gemeinden)
	{
		this.name = name;
		kurz = k;
		this.gemeinden = gemeinden;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKurz() {
		return kurz;
	}

	public void setKurz(String kurz) {
		this.kurz = kurz;
	}

	public ArrayList<Gemeinde> getGemeinden() {
		return gemeinden;
	}

	public void setGemeinden(ArrayList<Gemeinde> gemeinden) {
		this.gemeinden = gemeinden;
	}
	
	
}

