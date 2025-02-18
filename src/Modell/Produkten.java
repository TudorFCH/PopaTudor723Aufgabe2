package Modell;

public class Produkten {
    private String Name;
    private double Preis;
    private String Herkunftsregion;

    public Produkten(String name, double preis, String herkunftsregion) {
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

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
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
        return "Modell.Produkten{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", Herkunftsregion='" + Herkunftsregion + '\'' +
                '}';
    }
}