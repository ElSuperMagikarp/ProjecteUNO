package UNO;

import java.util.Stack;

public class Pilo {
    private Stack<Carta> cartes;

    public Pilo() {
        cartes = new Stack<>();
    }

    public Stack<Carta> getCartes() {
        return cartes;
    }

    public void addCarta(Carta carta){
        cartes.push(carta);
    }

    public boolean validarCarta(Carta carta){
        Carta ultimaCarta = cartes.peek();
        return carta.getColor() == ultimaCarta.getColor() || carta.getNumero() == ultimaCarta.getNumero();
    }
}
