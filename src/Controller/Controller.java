package Controller;

import Model.Spieler;
import Model.Verein;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {
    private final List<Spieler> spieler = new ArrayList<>();
    private final List<Verein> vereinen = new ArrayList<>();

    public void addSpieler(String name, int alter, String position, int marktwert) { spieler.add(new Spieler(name, alter, position, marktwert)); }

    public List<Spieler> getSpieler() { return spieler; }

    public void updateSpieler(String name, int alter, String position, int marktwert) {
        for (Spieler spieler : spieler) {
            if (spieler.getName().equals(name)) {
                spieler.setAlter(alter);
                spieler.setPosition(position);
                spieler.setMarktwert(marktwert);
            }
        }
    }

    public void deleteSpieler(String name) {
        spieler.removeIf(s -> s.getName().equals(name));
    }

    public void addVerein(int id, String name, String stadt, List<Spieler> spieler){
        vereinen.add(new Verein(id, name, stadt, spieler));
    }

    public List<Verein> getVereinen (){ return vereinen; }

    public void updateVereinen(int id, String name, String stadt, List<Spieler> spieler){
        for (Verein verein : vereinen) {
            if (verein.getId() == id) {
                verein.setName(name);
                verein.setStadt(stadt);
                verein.setSpieler(spieler);
            }
        }
    }

    public void deleteVereinen(int id) { vereinen.removeIf(s -> s.getId() == id); }

    public List<Verein> filterVereinenNachStadt(String stadt) {
        return vereinen.stream()
                .filter(verein -> verein.getStadt().equalsIgnoreCase(stadt))
                .collect(Collectors.toList());
    }
}
