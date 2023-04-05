package s163;

 

public class NamVnamJhg 
{
    String Name;
    String Vnam;
    int Jhg;
    
    public NamVnamJhg(String name, String vnam, int jhg) {
        super();
        Name = name;
        Vnam = vnam;
        Jhg = jhg;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getVnam() {
        return Vnam;
    }
    public void setVnam(String vnam) {
        Vnam = vnam;
    }
    public int getJhg() {
        return Jhg;
    }
    public void setJhg(int jhg) {
        Jhg = jhg;
    }
    @Override
    public String toString() {
        return "NamVnamJhg [Name=" + Name + ", Vnam=" + Vnam + ", Jhg=" + Jhg + "]";
    }
}