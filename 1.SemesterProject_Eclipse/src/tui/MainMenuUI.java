package tui;
import java.awt.EventQueue;
import java.util.Scanner;
/**
 * Write a description of class MainMenuUI here.
 *
 */
public class MainMenuUI
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenuStart();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    public static void mainMenuStart()
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
                System.out.println("Generer test data.");
                break;
                case 3:
                exit = true;
                break;
                default: 
                System.out.println("ugyldig valgmulighed");
                break;
            }//end switch
        }//end while
    }//end start
    
    private static int openMainMenu()
    {       
        // creates a keyboard object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\f *** MENU ***");
        System.out.println(" 1. Opret et salg");
        System.out.println(" 2. Generer test data");
        System.out.println(" 3. Afslut program");
        System.out.print("\n Vælg mellem 1 og 2 eller 3: ");
        int choice = scanner.nextInt();

        return choice;
    }
}