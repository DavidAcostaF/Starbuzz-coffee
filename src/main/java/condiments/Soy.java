/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condiments;

/**
 *
 * @author af_da
 */
public class Soy implements ICondiment {
    public String description;
    public Float cost;

    public Soy() {
        this.description = "Soy";
        this.cost = 5.0f;
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
