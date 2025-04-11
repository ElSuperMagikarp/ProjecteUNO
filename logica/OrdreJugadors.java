package uno.logica;

import java.util.LinkedList;
import java.util.Collections;

public class OrdreJugadors {
    private LinkedList<Jugador> jugadors;
    private int jugadorActiuIndex = 0;

    public OrdreJugadors() {
        jugadors = new LinkedList<>();
    }

    public Jugador getJugadorActiuIndex() { return jugadors.get(jugadorActiuIndex); }

    public void crearJugador(String nomJugador) {
        jugadors.add(new Jugador(nomJugador));
    }

    public void passarTorn() {
        jugadorActiuIndex++;
        if (jugadorActiuIndex >jugadors.size()-1) {
            jugadorActiuIndex =0;
        }
    }

    public void barrejarOrdre() {
        Collections.shuffle(jugadors);
    }
}
