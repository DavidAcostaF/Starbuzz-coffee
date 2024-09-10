/*
 * Chocolate.java
 */
package condiments;

import beverage.Beverage;

/**
 * La clase Chocolate es un condimento que extiende la clase abstracta Condiment.
 * 
 * <p>Esta clase sigue el patrón de diseño Decorador, donde cada condimento envuelve 
 * una bebida y agrega su propia descripción y costo al de la bebida original.</p>
 * 
 * @author af_da
 */
public class Chocolate extends Condiment {
    public String description;
    public double cost;
    
    /**
     * Constructor de la clase Chocolate.
     * Inicializa el condimento de chocolate y asigna su costo y descripción.
     * 
     * @param beverage la bebida a la que se le agregará el condimento de chocolate
     */
    public Chocolate(Beverage beverage) {
       super(beverage);
       description = ", Chocolate";
       cost = 4.04D;
    }

    /**
     * Devuelve una descripción de la bebida con el condimento de chocolate agregado.
     * 
     * @return una cadena que describe la bebida junto con el chocolate
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }

    /**
     * Calcula y devuelve el costo total de la bebida, incluyendo el costo del condimento de chocolate.
     * 
     * @return el costo total de la bebida con chocolate
     */
    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
