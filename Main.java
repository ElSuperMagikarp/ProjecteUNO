package uno;

import uno.interficie.UI;
import uno.logica.Jugador;
import uno.logica.Mazo;
import uno.logica.Pilo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        Pilo pilo = new Pilo();
        Jugador j1 = new Jugador("Jugador 1");

        System.out.println("Cartes Mazo");
        UI.mostrarCartes(new ArrayList<>(mazo.getCartes()));

        mazo.barrejar();
        System.out.println("Cartes Mazo Barrejades");
        UI.mostrarCartes(new ArrayList<>(mazo.getCartes()));

        System.out.println(); System.out.println();
        System.out.println("REPARTINT CARTES:");
        System.out.println();

        pilo.addCarta(mazo.agafarCarta());
        for (int i=0; i<7; i++){
            j1.addCarta(mazo.agafarCarta());
        }

        System.out.println("Cartes Mazo");
        UI.mostrarCartes(new ArrayList<>(mazo.getCartes()));
        System.out.println("Cartes Pilo");
        UI.mostrarCartes(new ArrayList<>(pilo.getCartes()));
        System.out.println("Cartes Jugador");
        UI.mostrarCartes(j1.getCartes());

        System.out.println(); System.out.println();
        System.out.println("TIRANT CARTES:");
        System.out.println();

        while (!j1.getCartes().isEmpty()) {
            j1.tirarCarta(j1.getCartes().getFirst(), pilo);
        }

        System.out.println("Cartes Mazo");
        UI.mostrarCartes(new ArrayList<>(mazo.getCartes()));
        System.out.println("Cartes Pilo");
        UI.mostrarCartes(new ArrayList<>(pilo.getCartes()));
        System.out.println("Cartes Jugador");
        UI.mostrarCartes(j1.getCartes());


        System.out.println(); System.out.println();
        System.out.println("REINICIANT MAZO:");
        System.out.println();

        mazo.reiniciar(pilo);

        System.out.println("Cartes Mazo");
        UI.mostrarCartes(new ArrayList<>(mazo.getCartes()));
        System.out.println("Cartes Pilo");
        UI.mostrarCartes(new ArrayList<>(pilo.getCartes()));
    }
}
