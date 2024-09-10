/*
 * HouseBlend.java
 */
package beverage;

/**
 * La clase HouseBlend representa una bebida específica, "House Blend Coffee".
 * 
 * <p>Proporciona una descripción y un costo predeterminados para esta bebida.</p>
 * 
 * @author af_da
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor de la clase HouseBlend.
     * Establece la descripción de la bebida como "House Blend Coffee".
     */
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    /**
     * Devuelve el costo de la bebida House Blend.
     * 
     * @return el costo de la bebida, que es 40.00
     */
    @Override
    public double getCost() {
        return 40.00D;
    }
}
