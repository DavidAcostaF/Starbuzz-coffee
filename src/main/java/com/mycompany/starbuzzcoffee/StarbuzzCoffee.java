/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.starbuzzcoffee;

import beverage.Beverage;
import beverage.Expresso;
import condiments.Chocolate;
import condiments.Milk;

/**
 *
 * @author af_da
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage = new Chocolate(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());
    }
    
}
