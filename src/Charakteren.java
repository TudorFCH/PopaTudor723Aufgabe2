import java.util.*;

public class Charakteren {
    private int ID;
    private String Name;
    private String Herkunftsdorf;
    private List<Produkten> Produkten;

    public Charakteren(int ID, String name, String herkunftsdorf) {
        this.ID = ID;
        this.Name = name;
        this.Herkunftsdorf = herkunftsdorf;
        this.Produkten = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHerkunftsdorf() {
        return Herkunftsdorf;
    }

    public void setHerkunftsdorf(String herkunftsdorf) {
        Herkunftsdorf = herkunftsdorf;
    }

    public List<Produkten> getProdukten() {
        return Produkten;
    }

    public void setProdukten(List<Produkten> produkten) {
        Produkten = produkten;
    }

    public List<Produkten> getPurchasedProducts(){
        return Produkten;
    }

    public void addProdukten(Produkten produkten){
        Produkten.add(produkten);
    }

    @Override
    public String toString() {
        return "Charakteren{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Herkunftsdorf='" + Herkunftsdorf + '\'' +
                ", Produkten=" + Produkten +
                '}';
    }
}
