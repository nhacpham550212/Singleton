/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.chicago;

import pizza.Pizza;

/**
 *
 * @author asus
 */
public class ChicagoPepperoniStyle extends Pizza
{

    public ChicagoPepperoniStyle()
    {
        pizzaStr = "Chào các bạn! Đây là pizza pepperoni kiểu Chicago\n";
    }
    @Override
    public void prepare()
    {
        pizzaStr +="Chuẩn bị bột với hành\n";
    }

    @Override
    public void bake()
    {
        pizzaStr +="Nướng ở 250 độ C trong 10 phút\n";
    }
    
}
