package s163;

import java.util.ArrayList;

public class Familie 
{
	String Name;
	Mensch Vater;
	Mensch Mutter;
	ArrayList<Mensch> Kinder;
	public Familie(String name, Mensch vater, Mensch mutter, ArrayList<Mensch> kinder) {
		super();
		Name = name;
		Vater = vater;
		Mutter = mutter;
		Kinder = kinder;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Mensch getVater() {
		return Vater;
	}
	public void setVater(Mensch vater) {
		Vater = vater;
	}
	public Mensch getMutter() {
		return Mutter;
	}
	public void setMutter(Mensch mutter) {
		Mutter = mutter;
	}
	public ArrayList<Mensch> getKinder() {
		return Kinder;
	}
	public void setKinder(ArrayList<Mensch> kinder) {
		Kinder = kinder;
	}

}
