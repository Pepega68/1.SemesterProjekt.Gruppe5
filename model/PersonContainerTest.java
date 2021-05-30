package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PersonContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonContainerTest
{
    PersonContainer personContainer;
    Person person1;
    Person person2;
    
    /**
     * Default constructor for test class PersonContainerTest
     */
    public PersonContainerTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        personContainer = personContainer.getInstance();
        person1 = new Person("Bublik", "Bublikvej 10", 9000, "Aalborg", "420420", "Cool dude");
        person2 = new Person("Jens", "Jensvej 69", 9700, "Brøndeslev", "42042069", "Nice dude");
        personContainer.addPerson(person1);
        personContainer.addPerson(person2);
    }

    @Test
    public void findPersonTest()
    {
        assertEquals(personContainer.findPersonByPhoneNumber("420420"), person1);
        assertEquals(personContainer.findPersonByPhoneNumber("42042069"), person2);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        personContainer = null;
    }
}
