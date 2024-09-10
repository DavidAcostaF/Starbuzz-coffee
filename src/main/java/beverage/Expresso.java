/*
 * Expresso.java
 */
package beverage;

/**
 * La clase Expresso representa una bebida específica, "Espresso".
 * Es una subclase concreta de la clase abstracta Beverage, que define un café espresso.
 * 
 * <p>Proporciona una descripción y un costo predeterminados para esta bebida.</p>
 * 
 * @author af_da
 */
public class Expresso extends Beverage {

    /**
     * Constructor de la clase Expresso.
     * Establece la descripción de la bebida como "Espresso".
     */
    public Expresso() {
        description = "Espresso";
    }

    /**
     * Devuelve el costo de la bebida Espresso.
     * 
     * @return el costo de la bebida, que es 40.00
     */
    @Override
    public double getCost() {
        return 40.00D;
    }
}
