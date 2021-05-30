package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ProductTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductTest
{
    Product product;
    /**
     * Default constructor for test class ProductTest
     */
    public ProductTest()
    {
        product = new Product("Saw", 1111, 2222, "Tools");
    }

    /**
     * Testing accessors.
     */
    @Test
    public void testAttributes()
    {
        assertEquals(product.getProductInfo(), "Saw");
        assertEquals(product.getBarcode(), 1111);
        assertEquals(product.getProductID(), 2222);
        assertEquals(product.getProductCategory(), "Tools");
    }
    
}
