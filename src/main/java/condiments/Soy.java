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

    public Soy(String description, Float cost) {
        this.description = description;
        this.cost = cost;
    }
    
   
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Float getCost() {
        return cost;
    }
    @Override
    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
}
