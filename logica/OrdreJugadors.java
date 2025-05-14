package uno.logica;

import uno.interficie.UI;

import java.util.LinkedList;
import java.util.Collections;

public class OrdreJugadors {
    private LinkedList<Jugador> jugadors;
    private int jugadorActiuIndex = 0;
    private boolean ordreInvertit;

    public OrdreJugadors() {
        jugadors = new LinkedList<>();
        ordreInvertit = false;
    }

    public Jugador getJugadorActiu() { return jugadors.get(jugadorActiuIndex); }

    public void showOrdre() {
        for (Jugador jugador : jugadors) {
            System.out.println(jugador.getNom());
        }
    }

    public void crearJugador(String nomJugador) {
        jugadors.add(new Jugador(nomJugador));
    }

    public void passarTorn() {
        if (!ordreInvertit) {
            // Ordre normal
            jugadorActiuIndex++;
            if (jugadorActiuIndex > jugadors.size()-1) {
                jugadorActiuIndex = 0;
            }
        } else {
            // Ordre invertit
            jugadorActiuIndex--;
            if (jugadorActiuIndex < 0) {
                jugadorActiuIndex = jugadors.size()-1;
            }
        }
    }

    public void barrejarOrdre() {
        Collections.shuffle(jugadors);
    }

    public void invertirOrdre() {
        ordreInvertit = !ordreInvertit;
        UI.invertirOrdre();
    }
}
