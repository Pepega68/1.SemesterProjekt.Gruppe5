package control;
import model.PersonContainer;
import model.Person;
/**
 * Used for controlling Person class
 */
public class PersonController
{
    private PersonContainer personContainer;

    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        personContainer = PersonContainer.getInstance();
    }

    /**
     * Searches for person by phoneNumber
     * @param String phoneNumber
     * @return Person
     */
    public Person findPersonByPhoneNumber(String phoneNumber)
    {
        return personContainer.findPersonByPhoneNumber(phoneNumber);
    }
}
