package model; 
import java.util.ArrayList;
import java.util.Optional;
import java.util.NoSuchElementException;

/**
 * Contains Person after they're created
 */
public class PersonContainer
{
    private ArrayList<Person> persons;
    private static PersonContainer instance;

    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer()
    {
        persons = new ArrayList<>();       
    }

    /**
     * Singleton method
     */
    public static PersonContainer getInstance() 
    {
        if(instance == null) 
        {
            instance = new PersonContainer();
        }
        return instance;
    }

    /**
     * Searches for person by number
     * @param int
     * @return phoneNumber
     */
    public Person findPersonByPhoneNumber(String phoneNumber)
    {
        if(!persons.isEmpty())
        {
            for(Person c : persons)
            {
                if(c.getPhoneNumber().equals(phoneNumber))
                {
                    return c;
                }
            }
        }
        throw new NoSuchElementException("Person ikke fundet");
    }

    /**
     * Adds person to the container
     */
    public void addPerson(Person person)
    {
        persons.add(person);
    }

    /**
     * Gets size from persons ArrayList
     */
    public int getSize()
    {
        return persons.size();
    }
}
