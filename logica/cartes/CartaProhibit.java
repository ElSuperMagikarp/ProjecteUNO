package uno.logica.cartes;

import uno.Partida;
import uno.interficie.UI;
import uno.logica.OrdreJugadors;

public class CartaProhibit extends Carta{
    public CartaProhibit(Color color, Partida partida) {
        this.simbol = "P";
        this.color = color;
        this.partida = partida;

        assert color != Color.Incolor;
    }

    @Override
    public void accio() {
        OrdreJugadors ordreJugadors = partida.getOrdreJugadors();
        ordreJugadors.passarTorn();
        UI.jugadorPerdTorn(ordreJugadors);
    }
}
