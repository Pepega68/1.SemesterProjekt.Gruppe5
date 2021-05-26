package control;

/**
 * Lav en beskrivelse af klassen ProdutController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class ProdutController
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private ProductController;
    private static ProductContainer instance;

    /**
     * Konstruktør for objekter af klassen ProdutController
     */
    private ProdutController()
    {
        // initialiser instansvariable
        container = container.getInstance();
    }
    public static productContainer getInstance()
    {
    if(instance == null) {
        instance = new ProductContainer();
    }
    return instance
    
    
    public Product findProductByID(int productID){
        Product x = null;
        boolean finished = false;
        if(!product.isEmpty())
            for(Product i : products)
            {
                if(i.getProductID().equals(productID))
                {
                    return i;
                }

            }
    }
}
}