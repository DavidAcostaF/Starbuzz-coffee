/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package condiments;

import beverage.Beverage;

/**
 * La clase WhippedCream es un condimento que extiende la clase abstracta Condiment.
 * 
 * <p>Esta clase sigue el patrón de diseño Decorador, donde cada condimento envuelve 
 * una bebida y agrega su propia descripción y costo al de la bebida original.</p>
 * 
 * @author af_da
 */
public class WhippedCream extends Condiment {

    public String description;
    public double cost;
    
    /**
     * Constructor de la clase WhippedCream.
     * Inicializa el condimento de crema batida y asigna su costo y descripción.
     * 
     * @param beverage la bebida a la que se le agregará el condimento de crema batida
     */
    public WhippedCream(Beverage beverage) {
       super(beverage);
       description = ", WhippedCream";
       cost = 8.04D;
    }

    /**
     * Devuelve una descripción de la bebida con el condimento de crema batida agregado.
     * 
     * @return una cadena que describe la bebida junto con la crema batida
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }

    /**
     * Calcula y devuelve el costo total de la bebida, incluyendo el costo del condimento de crema batida.
     * 
     * @return el costo total de la bebida con crema batida
     */
    @Override
    public double getCost() {
        return beverage.getCost() + this.cost;
    }
}
