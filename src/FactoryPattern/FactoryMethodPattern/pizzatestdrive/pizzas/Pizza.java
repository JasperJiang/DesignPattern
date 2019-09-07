package FactoryPattern.FactoryMethodPattern.pizzatestdrive.pizzas;

import java.util.ArrayList;

/**
 * abstract Pizza
 */
public abstract class Pizza {

     String name;
     String dough;
     String sauce;

     ArrayList<String> toppings = new ArrayList();

     public void prepare(){
         System.out.println("Preparing " + name);
         System.out.println("Tossing dough ...");
         System.out.println("Adding souce ...");
         System.out.println("Adding toppings: ");
         for (String topping : toppings) {
             System.out.println("    " + topping);
         }
     }

     public void bake(){
         System.out.println("bake ...");
     }

     public void cut(){
         System.out.println("cut ...");
     }

     public void box(){
         System.out.println("box ...");
     }

     public String getName(){
         return name;
     }

}
