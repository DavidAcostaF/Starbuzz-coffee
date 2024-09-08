/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import condiments.ICondiment;

/**
 *
 * @author af_da
 */
public class Beverage implements ICondiment{
    public String description;
    public Float cost;
    public ICondiment wrappee;
    
    public Beverage(ICondiment condiment) {
        this.wrappee = condiment;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String getDescription(){
        return wrappee.getDescription();
    }
    public Float getCost() {
        return wrappee.getCost();
    }
}
