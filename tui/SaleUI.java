package tui;
import control.SaleController;
import control.PersonController;
import control.ProductController;
import java.util.Scanner;
import java.text.NumberFormat;
import model.Sale;
import java.util.NoSuchElementException;

/**
 * UI for Sale creation
 */
public class SaleUI
{
    // instance variables
    private SaleController saleController;
    private PersonController personController;
    private ProductController productController;
    private Scanner scanner;
    private MainMenuUI main;

    /**
     * Constructor for objects of class LoanUI
     */
    public SaleUI()
    {
        // initialise instance variables
        personController = new PersonController();
        productController = new ProductController();
        saleController = new SaleController(productController, personController);
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
        Sale l = saleController.createSale();
        System.out.println("Salget er registreret og tilføjet.\n");
    }
    
    private void endSale(){
        System.out.println("Indtast telefonummer for at afslutte salget");
        try{
            saleController.endSale(scanner.next());
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
