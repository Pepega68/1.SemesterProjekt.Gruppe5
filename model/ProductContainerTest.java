package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ProductContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductContainerTest
{
    ProductContainer productContainer;
    Product product1;
    Product product2;
    /**
     * Default constructor for test class ProductContainerTest
     */
    public ProductContainerTest()
    {

    }
    
    @BeforeEach
    public void setUp()
    {
        productContainer = productContainer.getInstance();
        product1 = new Product("Saw", 1111, 2222, "Tools");
        product2 = new Product("Bolts", 2222, 3333, "Washers");
        productContainer.addProduct(product1, 1);
        productContainer.addProduct(product2, 1); 
    }
    
    @AfterEach
    public void tearDown()
    {
        
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void findProductTest()
    {
        assertEquals(productContainer.getProduct(1111), product1);
        assertEquals(productContainer.getProduct(2222), product2);
    }
}
