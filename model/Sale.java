package model;
import java.util.ArrayList;
import java.time.LocalDate;


/**
 * Write a description of class Sale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sale
{
    // instance variables - replace the example below with your own
    private ArrayList<SLI> saleListItems;
    private LocalDate date;
    private int totalPrice;
    private Person customer;
    /**
     * Constructor for objects of class Sale
     */
    public Sale()
    {

    }

    /**
     * 
     */
    public void addSLI(SLI sli)
    {
        saleListItems.add(sli);
    }
    
    public void addPerson(Person customer)
    {
        //this.customer = customer.;
    }
}
