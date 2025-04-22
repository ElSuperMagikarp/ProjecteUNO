package uno.logica;

public class Regles {
    public static boolean sonCartesCompatibles(Carta carta1, Carta carta2) {
        boolean colorsIguals = carta1.getColor() == carta2.getColor();
        boolean numerosIguals = carta1.getNumero() == carta2.getNumero();
        return colorsIguals || numerosIguals;
    }
}