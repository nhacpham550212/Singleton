/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.chicago.ChicagoCheeseStyle;
import pizza.chicago.ChicagoClamStyle;
import pizza.chicago.ChicagoPepperoniStyle;

/**
 *
 * @author asus
 */
public class ChicagoPizzaStoreSingleton extends PizzaStore
{
    private static ChicagoPizzaStoreSingleton instance;

    protected ChicagoPizzaStoreSingleton() {
    }
        public static ChicagoPizzaStoreSingleton createInstanceChicagoStore()
    {
        if(instance==null) instance = new ChicagoPizzaStoreSingleton();
        return instance;
    }
    
        

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoClamStyle();
            case pepperoni: return new ChicagoPepperoniStyle();
        }  
        return null;
    }
    
}