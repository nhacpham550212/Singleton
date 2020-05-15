/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.ny.NYCheeseStyle;
import pizza.ny.NYClamStyle;
import pizza.ny.NYPepperoniStyle;

/**
 *
 * @author asus
 */
public class NYPizzaStoreSingleton extends PizzaStore
{
    private static NYPizzaStoreSingleton instance;

    protected NYPizzaStoreSingleton() {
    }
        public static NYPizzaStoreSingleton createInstanceNYStore()
    {
        if(instance==null) instance = new NYPizzaStoreSingleton();
        return instance;
    }
    
        

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new NYCheeseStyle();
            case clam: return new NYClamStyle();
            case pepperoni: return new NYPepperoniStyle();
        }  
        return null;
    }
    
}
