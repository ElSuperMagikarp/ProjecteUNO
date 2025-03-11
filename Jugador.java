package UNO;

import java.util.ArrayList;

public class Jugador {
    private final String nom;
    private ArrayList<Carta> cartes;

    public Jugador (String n){
        nom = n;
        cartes = new ArrayList<>();
    }

    public String getNom(){return nom;}
    public ArrayList<Carta> getCartes(){return cartes;}
}
