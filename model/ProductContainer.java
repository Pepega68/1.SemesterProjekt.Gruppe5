package model;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Write a description of class ProductContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductContainer
{
    private HashMap<Product, Integer> products;
    private static ProductContainer instance;

    /**
     * Konstruktør for objekter af klassen ProdutController
     */
    private ProductContainer()
    {
        products = new HashMap<>();
    }

    public static ProductContainer getInstance()
    {
        if(instance == null) {
            instance = new ProductContainer();
        }
        return instance;
    }
    
    public void addProduct(Product product, int quantity){
        products.put(product, quantity);
    }
    
    public Map.Entry<Product, Integer> getProduct(int barcode){
        for(Map.Entry<Product, Integer> entry : products.entrySet()){
            if(entry.getKey().getBarcode() == barcode){
                return entry;
            }
        }
        throw new NoSuchElementException("Produkt ikke fundet");
    }
    
    /*public Product getProduct(int barcode){
        for(Product entry : products.keySet()){
            if(entry.getBarcode() == barcode){
                return entry;
            }
        }
        throw new NoSuchElementException("Produkt ikke fundet");
    }*/
}
