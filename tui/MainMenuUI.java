package tui;
import java.util.Scanner;
/**
 * Write a description of class MainMenuUI here.
 *
 */
public class MainMenuUI
{
    public void mainMenuStart()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choice = openMainMenu();
            SaleUI saleUI = new SaleUI();
            switch (choice)
            {
                case 1:
                saleUI.startMenu();
                break;
                
                case 2:
                TryMe tryMe = new TryMe();
                tryMe.generateData();
                System.out.println("Generede test data.");
                break;
                case 3:
                exit = true;
                break;
                default: 
                System.out.println(" Are you dalbaeb m8? Valg mellem 1 og 3");
            }//end switch
        }//end while
    }//end start
    
    private int openMainMenu()
    {       
        // creates a keyboard object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\f *** SCIK ASS MENU ***");
        System.out.println(" 1. ALT ER GRATIS");
        System.out.println(" 2. Generer test data");
        System.out.println(" 3. QUITS");
        System.out.print("\n Bestem dig: ");

        int choice = scanner.nextInt();

        return choice;
    }
}

