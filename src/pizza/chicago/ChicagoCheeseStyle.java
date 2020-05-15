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
public class ChicagoCheeseStyle extends Pizza
{
    
    public ChicagoCheeseStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Cheese kiểu Chicago\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Cheesse\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 200 độ C trong 15 phút\n";
    }
    
}
