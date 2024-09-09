/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package condiments;

import beverage.Beverage;

/**
 *
 * @author af_da
 */
public abstract class Condiment extends Beverage {
    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
