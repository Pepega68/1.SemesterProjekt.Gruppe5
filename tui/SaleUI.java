package tui;
import control.SaleController;
import control.PersonController;
import control.ProductController;

import model.ProductContainer;

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
    
    private ProductContainer productContainer;

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
        private int openSaleMenu()
    {       
        // creates a keyboard object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*** Udlåns Menu ***");
        System.out.println("(1) Opret salg");
        System.out.println("(2) Tilbage til hovedmenu ");
        System.out.println();
        System.out.print("Valg: ");

        int choice = scanner.nextInt();

        return choice;
    }
    
    /**
     * Main method
     */
    public void startMenu()
    {    
        boolean finished = false;
        //saleUI();
        while(!finished)
        {
            int choice = openSaleMenu();
            switch(choice)
            {
                
                
                case 1:
                    createSale();
                    findProduct();
                    endSale();
                break;
                case 2:
                
                    finished = true;
                break;
                default: 
                System.out.println(" Are you dalbaeb m8? Valg mellem 1 og 2");
            }
            
            /*else
            {
                System.out.print("Forkert input. Valg være et nummer.");
                scanner.next();
            }*/
        }
        MainMenuUI main = new MainMenuUI();
        //main.startApp();
    }    

    /**
     * Finds person by name receiving the loan
     */
    private void findPerson()
    {
        System.out.println("Indtast låners telefon nummer: ");
        String phoneNumber = scanner.next();
        saleController.findPersonByPhoneNumber(phoneNumber);
        /*System.out.print("Låner findes ikke. Prøv igen.");
        phoneNumber = scanner.next();
        saleController.findPersonByPhoneNumber(phoneNumber);*/
    }

    /**
     * Finds copy of LP by serialnumber
     */
    
    private void findProduct()
    {
        System.out.println("Indtast barcode nr. og antal af produkter: ");
        Integer barcode;
        Integer quantity;
        barcode = scanner.nextInt();
        quantity = scanner.nextInt(); //??
        saleController.enterProduct(barcode,quantity);
    }

    /**
     * Creates the Sale
     */
    private void createSale()
    {
        saleController.createSale();
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
