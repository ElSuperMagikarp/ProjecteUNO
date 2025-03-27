package UNO;

import java.util.ArrayList;

public class Jugador {
    private final String nom;
    private ArrayList<Carta> cartes;

    public Jugador(String nomJugador) {
        nom = nomJugador;
        cartes = new ArrayList<>();
    }

    public String getNom(){return nom;}
    public ArrayList<Carta> getCartes(){return cartes;}

    public void addCarta(Carta carta){
        cartes.add(carta);
    }

    public void tirarCarta(Carta carta, Pilo pilo){
        if (pilo.validarCarta(carta)) {
            cartes.remove(carta);
            pilo.addCarta(carta);
        }
    }
}
