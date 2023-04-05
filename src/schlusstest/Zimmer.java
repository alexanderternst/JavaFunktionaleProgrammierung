package schlusstest;

public class Zimmer 
{
	int Nr;
	int Einzelbett;
	int Doppelbett;
	
	boolean Bad;
	boolean Dusche;
	boolean Meerblick;
	
	public Zimmer(int nr, int einzelbett, int doppelbett, boolean bad, boolean dusche, boolean meerblick) {
		super();
		Nr = nr;
		Einzelbett = einzelbett;
		Doppelbett = doppelbett;
		Bad = bad;
		Dusche = dusche;
		Meerblick = meerblick;
	}
	
	public int getNr() {
		return Nr;
	}
	public void setNr(int nr) {
		Nr = nr;
	}
	public int getEinzelbett() {
		return Einzelbett;
	}
	public void setEinzelbett(int einzelbett) {
		Einzelbett = einzelbett;
	}
	public int getDoppelbett() {
		return Doppelbett;
	}
	public void setDoppelbett(int doppelbett) {
		Doppelbett = doppelbett;
	}
	public boolean isBad() {
		return Bad;
	}
	public void setBad(boolean bad) {
		Bad = bad;
	}
	public boolean isDusche() {
		return Dusche;
	}
	public void setDusche(boolean dusche) {
		Dusche = dusche;
	}
	public boolean isMeerblick() {
		return Meerblick;
	}
	public void setMeerblick(boolean meerblick) {
		Meerblick = meerblick;
	}
	
	int getKap()
	{
		return Doppelbett * 2 + Einzelbett;
	}
}