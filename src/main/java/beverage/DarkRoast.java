/*
 * DarkRoast.java
 */
package beverage;

/**
 * La clase DarkRoast representa una bebida específica, "Dark Roast Coffee".
 * 
 * <p>Proporciona una descripción y un costo predeterminados para esta bebida.</p>
 * 
 * @author af_da
 */
public class DarkRoast extends Beverage {
    
    /**
     * Constructor de la clase DarkRoast.
     * Establece la descripción de la bebida como "Dark Roast Coffee".
     */
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    /**
     * Devuelve el costo de la bebida Dark Roast.
     * 
     * @return el costo de la bebida, que es 80.00
     */
    @Override
    public double getCost() {
        return 80.00D;
    }
}
