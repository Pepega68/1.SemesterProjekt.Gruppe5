package tui;
import java.util.Scanner;
/**
 * Write a description of class MainMenuUI here.
 *
 */
public class MainMenuUI
{
    // instance variables
    private int choice;
    private Scanner scanner;
    private LoanUI loanUI;
    private TryMe tryMe;
    /**
     * Constructor for objects of class MainMenuUI
     */
    public MainMenuUI()
    {
        scanner = new Scanner(System.in);
        loanUI = new LoanUI();
    }

    public void startApp()
    {
        printMenu();
        boolean finished = false;
        while(!finished)
        {
            if(scanner.hasNextInt())
            {
                int choice = scanner.nextInt();
                if(choice == 1)
                {
                    loanUI.startMenu();
                    finished = true;
                }
                else if(choice == 2)
                {
                    tryMe = new TryMe();
                    tryMe.generateData();                
                    System.out.println("Testdata genereret");
                    System.out.println();
                    printMenu();
                }
                else if(choice == 3)
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
    }

    /**
     * Prints menu for user choice
     */
    private void printMenu() 
    {
        System.out.println("**** Hoved Menu ****");
        System.out.println("(1) Opret salg");
        System.out.println("(2) Generer testdata");
        System.out.println("(3) Luk program");
        System.out.println();
        System.out.print("Valg: ");
    }
}