package control;
import model.PersonContainer;
import model.Person;
/**
 * Used for controlling Person class
 */
public class PersonController
{
    // instance variable
    private PersonContainer container;

    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        // initialise instance variables
        container = container.getInstance();
    }

    /**
     * Searches for person by phoneNumber
     * @param String phoneNumber
     * @return Person
     */
    public Person findPersonByPhoneNumber(String phoneNumber)
    {
        return container.findPersonByPhoneNumber(phoneNumber);
    }
}
