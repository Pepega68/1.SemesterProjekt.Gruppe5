package control;
import model.Product; 
import model.ProductContainer;
/**
 * Lav en beskrivelse af klassen ProdutController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class ProductController
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private ProductContainer productContainer;

    public ProductController(){
        productContainer = ProductContainer.getInstance();
    }

    public Product findProductByBarcode(int barcode){
        return productContainer.getProduct(barcode).getKey();
    }
}