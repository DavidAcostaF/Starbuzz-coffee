/*
 * Soy.java
 */
package condiments;

import beverage.Beverage;

/**
 * La clase Soy es un condimento que extiende la clase abstracta Condiment.
 * 
 * <p>Esta clase sigue el patrón de diseño Decorador, donde cada condimento envuelve 
 * una bebida y agrega su propia descripción y costo al de la bebida original.</p>
 * 
 * @author af_da
 */
public class Soy extends Condiment {
    public String description;
    public double cost;
    
    /**
     * Constructor de la clase Soy.
     * Inicializa el condimento de leche de soja y asigna su costo y descripción.
     * 
     * @param beverage la bebida a la que se le agregará el condimento de leche de soja
     */
    public Soy(Beverage beverage) {
       super(beverage);
       description = ", Soy";
       cost = 8.04D;
    }

    /**
     * Devuelve una descripción de la bebida con el condimento de leche de soja agregado.
     * 
     * @return una cadena que describe la bebida junto con la leche de soja
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }

    /**
     * Calcula y devuelve el costo total de la bebida, incluyendo el costo del condimento de leche de soja.
     * 
     * @return el costo total de la bebida con leche de soja
     */
    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
