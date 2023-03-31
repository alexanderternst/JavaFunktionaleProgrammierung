package generika;

public class G21 
{
	public static void main(String[] args) 
	{
		Generiks<Double, String> generik = new Generiks<Double, String>();
		generik.setDing(15.3);
		generik.setDong("Hallo Aarau");
		System.out.println(generik.getDing()+ " " + generik.getDing().getClass());
		System.out.println(generik.getDong()+ " " + generik.getDong().getClass());
		
		Generiks<Double, Integer> generik2 = new Generiks<Double, Integer>(15.3 , 47);
		System.out.println(generik2.getDong()+ " " + generik2.getDong().getClass());
		System.out.println(generik2.getDing()+ " " + generik2.getDing().getClass());

        Generiks<Boolean, Boolean> generik3 = new Generiks<Boolean, Boolean>(true, false);
        System.out.println(generik3.getDong()+ " " + generik3.getDong().getClass());
        System.out.println(generik3.getDing()+ " " + generik3.getDing().getClass());
    }
}
