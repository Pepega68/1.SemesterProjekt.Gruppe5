package model;
import java.util.ArrayList;
import java.time.LocalDate;
import model.Sale;
import model.SLI;

/**
 * Write a description of class Sale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sale
{
    private ArrayList<SLI> saleListItems;
    private LocalDate date;
    private Person customer;
    /**
     * Constructor for objects of class Sale
     */
    public Sale()
    {
        saleListItems = new ArrayList();
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
        this.customer = customer;
    }
}