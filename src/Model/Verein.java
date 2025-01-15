package Model;

import java.util.List;

public class Verein {
    private int id;
    private String name;
    private String stadt;
    private List<Spieler> spieler;

    public Verein(int id, String name, String stadt, List<Spieler> spieler) {
        this.id = id;
        this.name = name;
        this.stadt = stadt;
        this.spieler = spieler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public List<Spieler> getSpieler() {
        return spieler;
    }

    public void setSpieler(List<Spieler> spieler) {
        this.spieler = spieler;
    }

}
