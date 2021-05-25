package tui;
import controller.SaleController;
import java.util.Scanner;
import java.text.NumberFormat;
import model.Sale;
/**
 * UI for Sale creation
 */
public class SaleUI
{
    // instance variables
    private SaleController saleController;
    private Scanner scanner;
    private MainMenuUI main;

    /**
     * Constructor for objects of class LoanUI
     */
    public SaleUI()
    {
        // initialise instance variables
        saleController = new SaleController();
        scanner = new Scanner(System.in);
    }

    /**
     * Prints text menu for userprompts
     */
    private void saleUI()
    {
        System.out.println("*** Udlåns Menu ***");
        System.out.println("(1) Opret salg");
        System.out.println("(2) Tilbage til hovedmenu ");
        System.out.println();
        System.out.print("Valg: ");
    }

    /**
     * Main method
     */
    public void startMenu()
    {    
        boolean finished = false;
        saleUI();
        while(!finished)
        {
            if(scanner.hasNextInt())
            {
                int choice = scanner.nextInt();
                if(choice == 1)
                {
                    findPerson();
                    findCopy();
                    createSale();
                    SaleUI();
                }
                else if(choice == 2)
                {
                    finished = true;
                }
                else
                {
                    System.out.println("Menupunkt findes ikke. Prøv igen.");
                }
            }
            else
            {
                System.out.print("Forkert input. Valg være et nummer.");
                scanner.next();
            }
        }
        MainMenuUI main = new MainMenuUI();
        main.startApp();
    }    

    /**
     * Finds person by name receiving the loan
     */
    private void findPerson()
    {
        System.out.println("Indtast låners navn: ");
        String name = scanner.next();
        loanController.findPersonByName(name);
        while(!loanController.nullPersonTester()) // Check that a person is returned
        {
            System.out.print("Låner findes ikke. Prøv igen.");
            name = scanner.next();
            loanController.findPersonByName(name);
        }
    }

    /**
     * Finds copy of LP by serialnumber
     */
    private void findCopy()
    {
        System.out.println("Indtast serienummer på den valgte kopi: ");
        Integer serialNumber = null;
        boolean finished = false;
        while(!finished)
        {
            if(scanner.hasNextInt()) // Checks the input is an int
            {
                serialNumber = scanner.nextInt();
                loanController.findCopyBySerialNumber(serialNumber);
                if(loanController.nullCopyTester()) // Checks if a copy is returned
                {
                    finished = true;
                }
                else // Error message if no copy is returned
                {
                    System.out.println("Serienummer findes ikke. Prøv igen.");
                }
            }
            else // Error message if input isn't an int
            {
                System.out.print("Forkert input. Skal være et nummer.");
                scanner.next();
            }
        }
    }

    /**
     * Creates the Sale
     */
    private void createSale()
    {
        Sale l = SaleController.createSale();
        System.out.println("Salget er registreret og tilføjet.\n");
    }
}
