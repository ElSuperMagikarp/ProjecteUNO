package uno.logica.cartes;

import uno.interficie.UI;

public class CartaCanviColor extends Carta{
    public CartaCanviColor() {
        this.simbol = "CC";
        this.color = Color.Incolor;
    }

    @Override
    public void accio() {
        this.color = UI.demanarColor();
    }
}
