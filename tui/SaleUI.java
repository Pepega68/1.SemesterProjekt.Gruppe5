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

        System.out.println("*** Menu ***");
        System.out.println("(1) Opret salg");
        System.out.println("(2) Tilføj flere produkter");
        System.out.println("(3) Afslut salget ");
        System.out.println("(4) Tilbage til hovedmenu ");
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
                findProductByBarcode();
                System.out.println("Ønsker du andre produkter?");
                break;
                case 2:
                findProductByBarcode();
                System.out.println("Produkter tilføjet til kurven");
                break;
                case 3:
                endSale();
                System.out.println("Salget er gennemført");
                break;
                case 4:
                finished = true;
                break;
                default: 
                System.out.println("ugyldig valgmulighed");
                break;
            }

        }
        MainMenuUI main = new MainMenuUI();
        //main.startApp();
    }    

    /**
     * Finds copy of LP by serialnumber
     */

    private void findProductByBarcode()
    {
        System.out.println("Indtast barcode nummer og antal af produkter: ");
        Integer barcode;
        Integer quantity;
        barcode = scanner.nextInt();
        quantity = scanner.nextInt();
        saleController.findProductByBarcode(barcode,quantity);//try catch
    }

    /**
     * Creates the Sale
     */
    private void createSale()
    {
        saleController.createSale();
        System.out.println("Salget er registreret.\n");
    }

    private void endSale()
    {
        System.out.println("Indtast telefonummer for at afslutte salget");
        try
        {
            String phoneNumber = scanner.next();
            saleController.endSale(phoneNumber);
        }
        catch(NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("købet er nu afsluttet.");
    }
}