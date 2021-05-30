package control;
import model.Sale;
import model.SaleContainer;
import model.PersonContainer;
import model.Person;
import model.SLI;
import java.util.NoSuchElementException;

/**
 * Write a description of class SaleController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaleController
{
    // instance variables - replace the example below with your own
    private Sale currentSale;
    private ProductController productController;
    private SaleContainer saleContainer;
    private PersonController personController;

    /**
     * Constructor for objects of class SaleController
     */
    public SaleController(ProductController productController, PersonController personController)
    {
        this.productController = productController;
        this.personController = personController;
        this.saleContainer = SaleContainer.getInstance();
    }

    public void findProductByBarcode(int barcode, int quantity)
    {
        currentSale.addSLI(
            new SLI( 
                productController.findProductByBarcode(barcode),
                quantity
            )
        );
    }

    public void endSale(String phoneNumber)
    {
        try
        {
            //Find and add person to sale 
            currentSale.addPerson(
                personController.findPersonByPhoneNumber(phoneNumber)
            );

            //Add sale to the container
            saleContainer.addSale(currentSale);
            //Since findPersonByPhoneNumber throws an exception, we catch it here and print an error message
        } 
        catch(NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void createSale()
    {
        currentSale = new Sale();
    }

    public Person findPersonByPhoneNumber(String phoneNumber)
    {
        return personController.findPersonByPhoneNumber(phoneNumber);
    }
}

