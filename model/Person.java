package model;
import java.util.ArrayList;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * Contains Person after they're created
 */
public class Person
{
    private String name;
    private String address;
    private int postalCode;
    private String city;
    private int phoneNumber;
    private String personInfo;

    /**
     * Constructor for objects of class PersonContainer
     */
    private Person(String name, String address, int postalCode, String city, int phoneNumber, String personInfo)
    {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.personInfo = personInfo;
    }

    /**
     * Gets name of person
     * @return String name
     */
    public String getName()
    {
        return name;        
    }

    /**
     * Gets address of person
     * @return String address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Gets phone number of person
     * @return String phonenr
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getCity()
    {
        return city;
    }

    public int getPostalCode()

    {
        return postalCode;
    }
    
    public String getPersonInfo()
    {
    return personInfo;
    }
}
