package s163;

public class Gemeinde 
{
	String name;
	String kurz;
	int km2;
	int bev;
	public Gemeinde(String name, String kurz, int km2, int bev) {
		super();
		this.name = name;
		this.kurz = kurz;
		this.km2 = km2;
		this.bev = bev;
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
	public int getKm2() {
//		System.out.println(km2);
		return km2;
	}
	public void setKm2(int km2) {
		this.km2 = km2;
	}
	public int getBev() {
		return bev;
	}
	public void setBev(int bev) {
		this.bev = bev;
	}	
}

