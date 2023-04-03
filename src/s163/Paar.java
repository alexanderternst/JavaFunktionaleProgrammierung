package s163;

public class Paar {
    Mensch Mann;
    Mensch Frau;

    public Paar(Mensch mann, Mensch frau) {
        super();
        Mann = mann;
        Frau = frau;
    }
    public Mensch getMann() {
        return Mann;
    }

    public Mensch getFrau() {
        return Frau;
    }

    public void setMann(Mensch mann) {
        Mann = mann;
    }

    public void setFrau(Mensch frau) {
        Frau = frau;
    }
}
