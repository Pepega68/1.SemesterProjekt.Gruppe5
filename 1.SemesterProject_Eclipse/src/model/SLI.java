package model;
import model.Product;

/**
 * Write a description of class SLI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SLI
{
    // instance variables - replace the example below with your own
    private int quantity;
    private Product product;
    /**
     * Constructor for objects of class SLI
     */
    public SLI(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;                
    }
}
