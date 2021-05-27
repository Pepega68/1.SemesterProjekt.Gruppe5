package tui;
import model.*;
/**
 * Class making mock data for loan creation
 */
public class TryMe
{
    // instance variables - replace the example below with your own
    private PersonContainer personContainer;
    private ProductContainer productContainer; 

    /**
     * Constructor for objects of class TryMe
     */
    public TryMe()
    {
        // initialise instance variables
        personContainer = PersonContainer.getInstance();
        productContainer = ProductContainer.getInstance();
    }

    /**
     * Generates data
     */
    public void generateData()
    {
        Person tester = new Person("Mogens", "Strandvejen 42", 9000, "Aalleren" , "42042069" , "Debil");
        personContainer.addPerson(tester); 
        Product testProduct = new Product("NUTS", 1234, 4321, "STUFF"); 
        productContainer.addProduct(testProduct, 20);
        
        /*LP plade = new LP("Kandis greatest hits", "Kandis", 12345);
        Copy cp = new Copy(12345, "01-01-1970", "500mil");
        lpContainer.addLP(plade);
        plade.addCopy(cp);*/
    }       
}

