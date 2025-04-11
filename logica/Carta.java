package uno.logica;

public class Carta {
    private final int numero;
    private final Color color;

    public Carta (int num, Color col){
        numero = num;
        color = col;
    }

    public int getNumero() {return numero;}
    public Color getColor() {return color;}
}
