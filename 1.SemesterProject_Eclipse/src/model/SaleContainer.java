package model;
import java.util.ArrayList;

/**
 * Write a description of class SaleContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaleContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Sale> sales;
    private static SaleContainer instance;

    /**
     * Constructor for objects of class SaleContainer
     */
    private SaleContainer()
    {
        sales = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static SaleContainer getInstance()
    {
        if(instance == null)
        {
            instance = new SaleContainer();
        }
        return instance;
    }
    
    public void addSale(Sale currentSale)
    {
        sales.add(currentSale);
    }
}

