package uno.logica.cartes;

import uno.Partida;

import java.util.Objects;

public abstract class Carta {
    protected Partida partida;
    protected String simbol;
    protected Color color;

    public enum Color {
        Groc,
        Vermell,
        Blau,
        Verd,
        Incolor
    }

    public String getSimbol() {return simbol;}
    public Color getColor() {return color;}

    public boolean sonCartesCompatibles(Carta carta) {
        boolean colorsIguals = color == carta.getColor();
        if (color == Color.Incolor || carta.getColor() == Color.Incolor) {
            colorsIguals = true;
        }
        boolean numerosIguals = Objects.equals(simbol, carta.getSimbol());

        return colorsIguals || numerosIguals;
    }

    public void accio() {}
}
