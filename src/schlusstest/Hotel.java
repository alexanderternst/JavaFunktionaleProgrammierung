//  public class Hotel 
//  public class HotelKette 
//  public class Zimmer 
//  public class ZimmerKompakt 

//  Eröffnen Sie eine package schlusstest
//  Mit den 4 Klassen
//  Lösen Sie die Aufgaben A-F in der Klasse Hotelkette

package schlusstest;

import java.util.ArrayList;

public class Hotel 
{
	String Name;
	int Sterne;
	ArrayList<Zimmer> zimmer;
	
	public Hotel(String name, int sterne, ArrayList<Zimmer> zimmer) {
		super();
		Name = name;
		Sterne = sterne;
		this.zimmer = zimmer;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSterne() {
		return Sterne;
	}

	public void setSterne(int sterne) {
		Sterne = sterne;
	}

	public ArrayList<Zimmer> getZimmer() {
		return zimmer;
	}

	public void setZimmer(ArrayList<Zimmer> zimmer) {
		this.zimmer = zimmer;
	}
}
