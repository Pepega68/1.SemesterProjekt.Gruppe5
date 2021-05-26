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
    private PersonContainer personContainer;
    private PersonController personController;
    private Person person;

    /**
     * Constructor for objects of class SaleController
     */
    public SaleController(ProductController productController)
    {
        this.productController = productController;
        this.saleContainer = SaleContainer.getInstance();
        this.personContainer = PersonContainer.getInstance();
    }

    public void enterProduct(int productId, int quantity){
        currentSale.addSLI(
            new SLI( 
                productController.findProduct(productId),
                quantity
            )
        );
    }

    public void endSale(String phoneNumber){
        try{
            currentSale.addPerson(
                personContainer.findPersonByPhoneNumber(phoneNumber)
            );

            saleContainer.addSale(currentSale);
        } catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    public void createSale(){
        this.currentSale = new Sale();
    }

    public Person findCustomerByPhone(String phoneNumber)
    {
        person = personController.findPersonByPhoneNumber(phoneNumber);
        return person;
    }
    
    public Sale endSale()
    {
        currentSale.addPerson(person);
        //mangles at put produkt på
        return currentSale;
    }

}

