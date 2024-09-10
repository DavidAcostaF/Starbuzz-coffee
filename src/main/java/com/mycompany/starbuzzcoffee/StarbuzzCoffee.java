/*
 * StarbuzzCoffee.java
 */
package com.mycompany.starbuzzcoffee;

import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Expresso;
import beverage.HouseBlend;
import condiments.Chocolate;
import condiments.Milk;
import condiments.WhippedCream;

/**
 *
 * @author af_da
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Ejemplo 1: Espresso con Chocolate y Leche
        Beverage beverage1 = new Expresso();
        beverage1 = new Chocolate(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println("Ejemplo 1:");
        System.out.println("Descripción: " + beverage1.getDescription());
        System.out.println("Costo: " + beverage1.getCost());
        System.out.println();

        // Ejemplo 2: House Blend con Leche
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Chocolate(beverage2);
        System.out.println("Ejemplo 2:");
        System.out.println("Descripción: " + beverage2.getDescription());
        System.out.println("Costo: " + beverage2.getCost());
        System.out.println();

        // Ejemplo 3: Dark Roast con Crema Batida
        Beverage beverage3 = new DarkRoast();
        beverage3 = new WhippedCream(beverage3);
        System.out.println("Ejemplo 3:");
        System.out.println("Descripción: " + beverage3.getDescription());
        System.out.println("Costo: " + beverage3.getCost());
    }
}
