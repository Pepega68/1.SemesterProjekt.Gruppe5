package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    Person person;
    /**
     * Default constructor for test class ProductTest
     */
    public PersonTest()
    {
        person = new Person("Bublik", "Bublikvej 10", 9000, "Aalborg", "420420", "Cool dude");
    }
    
    /**
     * Testing accessors.
     */
    @Test
    public void testAttributes()
    {
        assertEquals(person.getName(), "Bublik");
        assertEquals(person.getAddress(), "Bublikvej 10");
        assertEquals(person.getPostalCode(), 9000);
        assertEquals(person.getCity(), "Aalborg");
        assertEquals(person.getPhoneNumber(), "420420");
        assertEquals(person.getPersonInfo(), "Cool dude");
    }
    
}
