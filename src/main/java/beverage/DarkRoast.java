/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import condiments.Condiment;

/**
 *
 * @author af_da
 */
public class DarkRoast extends Beverage {
    
    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double getCost() {
        return 80.00D;
    }
    
}
