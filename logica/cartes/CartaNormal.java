package uno.logica.cartes;

import java.util.Objects;

public class CartaNormal extends Carta{
    private final String[] simbolsValids = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public CartaNormal(String numero, Color color){
        assert simbolValid(numero);
        assert color != Color.Incolor;

        simbol = numero;
        this.color = color;
    }

    private boolean simbolValid(String simbolIntroduit) {
        for (String simbolValid : simbolsValids) {
            if (Objects.equals(simbolValid,simbolIntroduit)) {
                return true;
            }
        }
        return false;
    }
}
