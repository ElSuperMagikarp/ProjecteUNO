package uno.logica;

import uno.Partida;
import uno.logica.cartes.*;

import java.util.Collections;
import java.util.Stack;

public class Mazo {
    private Stack<Carta> cartes;

    public Mazo(Partida partida) {
        cartes = new Stack<>();
        for (Carta.Color color : Carta.Color.values()) {
            if (color == Carta.Color.Incolor) {
                break;
            }

            cartes.push(new CartaNormal("0",color));
            for (int i=1; i<=9; i++){
                cartes.push(new CartaNormal(Integer.toString(i),color));
                cartes.push(new CartaNormal(Integer.toString(i),color));
            }

            // Cartes especials
            cartes.push(new CartaProhibit(color, partida));
            cartes.push(new CartaProhibit(color, partida));
            cartes.push(new CartaCanviSentit(color, partida));
            cartes.push(new CartaCanviSentit(color, partida));
            cartes.push(new CartaMes2(color, partida));
            cartes.push(new CartaMes2(color, partida));
        }
        for (int i=0; i<4; i++){
            cartes.push(new CartaCanviColor());
            cartes.push(new CartaMes4(partida));
        }
    }

    public boolean esBuid() {return cartes.isEmpty();}

    public Stack<Carta> getCartes() {
        return cartes;
    }

    public Carta agafarCarta() {
        return cartes.pop();
    }

    public void reiniciar(Pilo pilo) {
        Carta primeraCarta = pilo.agafarCarta();
        while (!pilo.getCartes().empty()){
            cartes.push(pilo.agafarCarta());
        }
        pilo.addCarta(primeraCarta);
        barrejar();
    }

    public void barrejar() {
        Collections.shuffle(cartes);
    }
}
