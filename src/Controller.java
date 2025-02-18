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

    public List<Charakteren> filterCharakterenByHerkunftsdorf(String herkunftsdorf) {
        return charakteren.stream()
                .filter(charakteren -> charakteren.getHerkunftsdorf().equalsIgnoreCase(herkunftsdorf))
                .collect(Collectors.toList());
    }

    public void purchaseProduct(int charakterID, String produktName) {
        Charakteren charakter = charakteren.stream()
                .filter(c -> c.getID() == charakterID)
                .findFirst()
                .orElse(null);

        Produkten product = produkten.stream()
                .filter(p -> p.getName().equalsIgnoreCase(produktName))
                .findFirst()
                .orElse(null);

        if (charakter == null) {
            System.out.println("Error: Customer with ID " + charakterID + " not found.");
            return;
        }
        if (product == null) {
            System.out.println("Error: Product '" + produktName + "' not found.");
            return;
        }

        charakter.addProdukten(product);
        System.out.println(charakter.getName() + " has purchased " + product.getName());
    }

    public List<Charakteren> getCharakterByProductDorf(String dorf){
        return charakteren.stream()
                .filter(charakteren -> charakteren.getPurchasedProducts().stream()
                        .anyMatch(produkten -> produkten.getHerkunftsregion().equalsIgnoreCase(dorf)))
                .collect(Collectors.toList());
    }

    public List<Produkten> sortProductsOfCharakter(int charakterID, boolean ascending){
        return charakteren.stream()
                .filter(charakteren -> charakteren.getID() == charakterID)
                .flatMap(charakteren -> charakteren.getPurchasedProducts().stream())
                .sorted(Comparator.comparing(Produkten::getName,
                        ascending ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

}
