/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;

/**
 *
 * @author asus
 */
public abstract class PizzaStore
{
    protected abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
