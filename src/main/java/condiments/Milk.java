/*
 * Milk.java
 */
package condiments;

import beverage.Beverage;

/**
 * La clase Milk es un condimento que extiende la clase abstracta Condiment.
 * 
 * <p>Esta clase sigue el patrón de diseño Decorador, donde cada condimento envuelve 
 * una bebida y agrega su propia descripción y costo al de la bebida original.</p>
 * 
 * @author af_da
 */
public class Milk extends Condiment {

    public String description;
    public double cost;
    
    /**
     * Constructor de la clase Milk.
     * Inicializa el condimento de leche y asigna su costo y descripción.
     * 
     * @param beverage la bebida a la que se le agregará el condimento de leche
     */
    public Milk(Beverage beverage) {
       super(beverage);
       description = ", Milk";
       cost = 4.04D;
    }

    /**
     * Devuelve una descripción de la bebida con el condimento de leche agregado.
     * 
     * @return una cadena que describe la bebida junto con la leche
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }

    /**
     * Calcula y devuelve el costo total de la bebida, incluyendo el costo del condimento de leche.
     * 
     * @return el costo total de la bebida con leche
     */
    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
