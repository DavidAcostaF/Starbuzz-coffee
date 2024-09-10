/*
 * Decaf.java
 */
package beverage;

/**
 * La clase Decaf representa una bebida específica, "Decaf Coffee".
 * 
 * <p>Proporciona una descripción y un costo predeterminados para esta bebida.</p>
 * 
 * @author af_da
 */
public class Decaf extends Beverage {

    /**
     * Constructor de la clase Decaf.
     * Establece la descripción de la bebida como "Decaf Coffee".
     */
    public Decaf() {
        description = "Decaf Coffee";
    }

    /**
     * Devuelve el costo de la bebida Decaf.
     * 
     * @return el costo de la bebida, que es 60.00
     */
    @Override
    public double getCost() {
        return 60.00D;
    }
}
