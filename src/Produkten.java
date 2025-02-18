

public class Produkten {
    private String Name;
    private int Preis;
    private String Herkunftsregion;

    public Produkten(String name, int preis, String herkunftsregion) {
        Name = name;
        Preis = preis;
        Herkunftsregion = herkunftsregion;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public String getHerkunftsregion() {
        return Herkunftsregion;
    }

    public void setHerkunftsregion(String herkunftsregion) {
        Herkunftsregion = herkunftsregion;
    }

    @Override
    public String toString() {
        return "Produkten{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", Herkunftsregion='" + Herkunftsregion + '\'' +
                '}';
    }
}