package s163;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bund 
{
	String name;
	String kurz;
	String topLevel;
	ArrayList<Land> laender;
	
	public Bund(String name, String kurz, String topLevel, ArrayList<Land> laender) 
	{
		super();
		this.name = name;
		this.kurz = kurz;
		this.topLevel = topLevel;
		this.laender = laender;
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

	public String getTopLevel() {
		return topLevel;
	}

	public void setTopLevel(String topLevel) {
		this.topLevel = topLevel;
	}

	public ArrayList<Land> getLaender() {
		return laender;
	}

	public void setLaender(ArrayList<Land> laender) {
		this.laender = laender;
	}
}

