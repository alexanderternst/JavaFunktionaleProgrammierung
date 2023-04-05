
package schlusstest;

public class ZimmerKompakt 
{
	String Hotelname;
	int Nr;
	int maxBelegung;
	public ZimmerKompakt(String hotelname, 
			int nr, int maxBelegung) {
		super();
		Hotelname = hotelname;
		Nr = nr;
		this.maxBelegung = maxBelegung;
	}
	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public int getNr() {
		return Nr;
	}
	public void setNr(int nr) {
		Nr = nr;
	}
	public int getMaxBelegung() {
		return maxBelegung;
	}
	public void setMaxBelegung(int maxBelegung) {
		this.maxBelegung = maxBelegung;
	}
}
