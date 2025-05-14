package uno.logica.cartes;

import uno.Partida;
import uno.interficie.UI;
import uno.logica.OrdreJugadors;

public class CartaCanviSentit extends Carta{
    public CartaCanviSentit(Color color, Partida partida) {
        this.simbol = "S";
        this.color = color;
        this.partida = partida;

        assert color != Color.Incolor;
    }

    @Override
    public void accio() {
        OrdreJugadors ordreJugadors = partida.getOrdreJugadors();
        if (ordreJugadors.getJugadorQuantity() > 2) {
            ordreJugadors.invertirOrdre();
        } else {
            UI.invertirOrdre();
            ordreJugadors.passarTorn();
        }
    }
}
