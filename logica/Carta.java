package uno.logica;

public class Carta {
    private final int numero;
    private final Color color;

    public enum Color {
        Groc,
        Vermell,
        Blau,
        Verd
    }

    public Carta (int num, Color col){
        numero = num;
        color = col;
    }

    public int getNumero() {return numero;}
    public Color getColor() {return color;}

    public boolean sonCartesCompatibles(Carta carta) {
        boolean colorsIguals = color == carta.getColor();
        boolean numerosIguals = numero == carta.getNumero();
        return colorsIguals || numerosIguals;
    }
}
