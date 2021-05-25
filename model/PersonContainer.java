package model; 
import java.util.ArrayList;
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
        if(instance == null) {
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
        Person x = null;
        boolean finished = false;
        int index = 0;
        for(Person p : persons)
        {
            if(index == persons.size())
            {
                finished = true;
            }
            else if(p.getPhoneNumber().equals(phoneNumber))
            {
                x = p;
                finished = true;
            }
            index++;
        }
        return x;
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
