/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condiments;

import beverage.Beverage;

/**
 *
 * @author af_da
 */
public class Soy extends Condiment {
    public String description;
    public double cost;
    
    public Soy(Beverage beverage) {
       super(beverage);
       description = ", Soy";
       cost = 8.04D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+this.description;
    }

    @Override
    public double getCost() {
        return beverage.getCost()+this.cost;
    }
    
}
