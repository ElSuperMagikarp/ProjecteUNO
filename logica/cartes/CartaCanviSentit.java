package uno.logica.cartes;

import uno.Partida;
import uno.interficie.UI;

public class CartaCanviSentit extends Carta{
    public CartaCanviSentit(Color color, Partida partida) {
        this.simbol = "S";
        this.color = color;
        this.partida = partida;

        assert color != Color.Incolor;
    }

    @Override
    public void accio() {
        partida.getOrdreJugadors().invertirOrdre();
    }
}
