/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author asus
 */
public abstract class Pizza
{
    protected String pizzaStr ="";

    public Pizza()
    {
    }
    public abstract void prepare();
    public abstract void bake();
    public void cut()
    {
        pizzaStr += "Cắt ra làm 8 miếng\n";
    }
    
    public void box()
    {
        pizzaStr += "Bỏ vào hộp\n";
    }

    @Override
    public String toString()
    {
        return pizzaStr;
    }
    
    
}
