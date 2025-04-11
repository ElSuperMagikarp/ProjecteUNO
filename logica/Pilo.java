package uno.logica;

import java.util.Stack;

public class Pilo {
    private Stack<Carta> cartes;

    public Pilo() {
        cartes = new Stack<>();
    }

    public Stack<Carta> getCartes() { return cartes; }

    public Carta consultarCarta(Carta carta){ return cartes.peek(); }

    public void addCarta(Carta carta){
        cartes.push(carta);
    }

    public Carta agafarCarta() { return cartes.pop(); }
}
