/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod59cntt1;

import pizza.Pizza;
import pizza.PizzaType;
import store.ChicagoPizzaStoreSingleton;
import store.NYPizzaStoreSingleton;
import store.PizzaStore;

/**
 *
 * @author asus
 */
public class FactoryMethod59CNTT1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ChicagoPizzaStoreSingleton ChicagoStore1 = ChicagoPizzaStoreSingleton.createInstanceChicagoStore(); //khởi tạo
        System.out.println(ChicagoStore1.orderPizza(PizzaType.clam)); //in
        
        NYPizzaStoreSingleton NYStore = NYPizzaStoreSingleton.createInstanceNYStore(); //khởi tạo
        System.out.println(NYStore.orderPizza(PizzaType.clam)); //in
    }
    
}
