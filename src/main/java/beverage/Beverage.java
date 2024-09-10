/*
 * Beverage.java
 */
package beverage;

/**
 * La clase abstracta Beverage representa una bebida.
 * Esta clase es la base para las bebidas en el sistema, y puede ser extendida
 * por clases concretas de bebidas y decorada por condimentos.
 * 
 * <p>Las subclases concretas deben implementar el método {@code getCost()} para 
 * devolver el costo de la bebida, y pueden sobrescribir el método {@code getDescription()}
 * para proporcionar una descripción personalizada.</p>
 * 
 * @author af_da
 */
public abstract class Beverage {
    String description = "";

    /**
     * Devuelve la descripción de la bebida.
     * 
     * @return la descripción de la bebida
     */
    public String getDescription() {
        return description;
    }

    /**
     * Calcula y devuelve el costo de la bebida.
     * Este método debe ser implementado por las subclases.
     * 
     * @return el costo de la bebida
     */
    public abstract double getCost();
}
