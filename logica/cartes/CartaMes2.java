package uno.logica.cartes;

import uno.Partida;
import uno.interficie.UI;
import uno.logica.Jugador;
import uno.logica.OrdreJugadors;

public class CartaMes2 extends Carta{
    public CartaMes2(Color color, Partida partida) {
        this.simbol = "+2";
        this.color = color;
        this.partida = partida;

        assert color != Color.Incolor;
    }

    @Override
    public void accio() {
        OrdreJugadors ordreJugadors = partida.getOrdreJugadors();
        ordreJugadors.passarTorn();

        Jugador seguentJugador = ordreJugadors.getJugadorActiu();
        seguentJugador.robaCarta(partida.getMazo());
        seguentJugador.robaCarta(partida.getMazo());

        UI.chupaCartes(seguentJugador,2);
        UI.jugadorPerdTorn(ordreJugadors);
    }
}
