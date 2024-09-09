/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condiments;

/**
 *
 * @author af_da
 */
public class WhippedCream implements ICondiment {

    public String description;
    public Float cost;

    public WhippedCream() {
        this.description = "Whipped cream";
        this.cost =11.2f;
    }
    
   
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Float getCost() {
        return cost;
    }

    
}
