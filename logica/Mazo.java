package uno.logica;

import java.util.Collections;
import java.util.Stack;

public class Mazo {
    private Stack<Carta> cartes;

    public Mazo() {
        cartes = new Stack<>();
        for (Carta.Color color : Carta.Color.values()) {
            cartes.push(new Carta(0,color));
            for (int i=1; i<=9; i++){
                cartes.push(new Carta(i,color));
                cartes.push(new Carta(i,color));
            }
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
