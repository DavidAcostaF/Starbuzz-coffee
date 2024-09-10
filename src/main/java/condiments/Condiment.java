/*
 * Condiment.java
 */
package condiments;

import beverage.Beverage;

/**
 * La clase abstracta Condiment representa un decorador de condimentos para bebidas.
 * Extiende la clase Beverage, permitiendo que los condimentos modifiquen 
 * dinámicamente la descripción y el costo de las bebidas.
 * 
 * <p>Esta clase sigue el patrón de diseño Decorador, donde cada condimento envuelve 
 * una bebida y puede agregar su propia descripción y costo.</p>
 * 
 * @author af_da
 */
public abstract class Condiment extends Beverage {
    protected Beverage beverage;

    /**
     * Constructor de la clase Condiment.
     * Inicializa el condimento con la bebida especificada.
     * 
     * @param beverage la bebida que será envuelta por el condimento
     */
    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Devuelve una descripción de la bebida, incluyendo cualquier condimento agregado.
     * Este método debe ser implementado por cualquier clase concreta de condimento.
     * 
     * @return una cadena que describe la bebida y sus condimentos
     */
    @Override
    public abstract String getDescription();
}
