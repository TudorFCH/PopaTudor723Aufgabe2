package Model;

public class Spieler {
    private String name;
    private int alter;
    private String position;
    private int marktwert;

    public Spieler(String name, int alter, String position, int marktwert) {
        this.name = name;
        this.alter = alter;
        this.position = position;
        this.marktwert = marktwert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMarktwert() {
        return marktwert;
    }

    public void setMarktwert(int marktwert) {
        this.marktwert = marktwert;
    }

    public void getVerein() {

    }

    public String toString() {
        return name + ", " + alter + ", " + position + ", " + marktwert + "$";
    }
}
