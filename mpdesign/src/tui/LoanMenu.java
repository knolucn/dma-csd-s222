package tui;


/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    // instance variables 

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
       
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
                System.out.println(" Not implemented yet");
            }
            //TODO perhaps you need further menu items?
            else {
                running = false;
            }
        }
    }

    private int writeLoanMenu() {
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n ***** Loan menu *****", "Back"); 
        menu.addOption("Create loan");
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
}
