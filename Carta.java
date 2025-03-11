package UNO;

public class Carta {
    public enum Color{
        Groc,
        Vermell,
        Blau,
        Verd
    }

    private int numero;
    private Color color;

    public int getNumero() {return numero;}
    public Color getColor() {return color;}
}
