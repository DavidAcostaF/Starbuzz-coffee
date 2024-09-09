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
public class Milk extends Condiment{

    public String description;
    public double cost;
    
    public Milk(Beverage beverage) {
       super(beverage);
       description = ", Milk";
       cost = 4.04D;
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
