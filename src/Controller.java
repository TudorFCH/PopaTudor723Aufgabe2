import java.util.*;
import java.util.stream.Collectors;

public class Controller {
    private final List<Produkten> produkten = new ArrayList<>();
    private final List<Charakteren> charakteren = new ArrayList<>();

    public void addProdukt(String name, int preis, String herkunftsregion) {
        produkten.add(new Produkten(name, preis, herkunftsregion));
    }

    public List<Produkten> getProducts() {
        return produkten;
    }

    public void updateProduct(int index, String name, int preis, String herkunftsregion) {
        if (index >= 0 && index < produkten.size()) {
            Produkten produkt = produkten.get(index);
            produkt.setName(name);
            produkt.setPreis(preis);
            produkt.setHerkunftsregion(herkunftsregion);
        }
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < produkten.size()) {
            produkten.remove(index);
        }
    }

    public void addCharakter(int ID, String name, String herkunftsdorf) { charakteren.add(new Charakteren(ID, name, herkunftsdorf));
    }

    public List<Charakteren> getCharakters() {
        return charakteren;
    }

    public void updateCharakteren(int ID, String name, String herkunftsdorf) {
        for (Charakteren charakteren : charakteren) {
            if (charakteren.getID() == ID) {
                charakteren.setName(name);
                charakteren.setHerkunftsdorf(herkunftsdorf);
            }
        }
    }

    public void deleteCharakter(int ID) {
        charakteren.removeIf(charakteren -> charakteren.getID() == ID);
    }
}
