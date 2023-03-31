package generika;

public class Generiks <T,R> {
    T ding;
	R dong;

	public Generiks() {
		ding = null;
		dong = null;
	}
	
	public Generiks(T neuesDing, R neuesDong)  {
		this.ding = neuesDing;
		this.dong = neuesDong;
	}
	
	public T getDing() 	{
		return ding;
	}
	
	public void setDing(T neuesDing) 	{
		this.ding = neuesDing;
	}

	public R getDong() 	{
		return dong;
	}
	
	public void setDong(R neuesDong) 	{
		this.dong = neuesDong;
	}
}

