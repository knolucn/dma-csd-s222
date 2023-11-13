package tui;
/**
 * Description of MainMenu goes here.
 * 
 * @author knol, mhi, hnv
 * @version 2018.10.19
 * @version 2019.03.29 changed menu to danish and changed method names to reflect the other example
 * @version 2019.03.29 changed menu to English
 */
public class MainMenu {
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		mm.start();
	}
    // instance variables 
    private LoanMenu loanMenu;

    /**
     * Constructor for objects of MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        loanMenu = new LoanMenu();
        
    }

    public void start() { 
        boolean exit=false;
        while (!exit) { //! means while exit not is true (that is: false)
            int choice = writeMainMenu();
            if(choice == 1) {
                System.out.println(" Not implemented yet");
                
            }
            else if(choice == 2) { 
                // TODO add code here
                System.out.println(" Not implemented yet");
            }
            else if(choice == 3) {
                loanMenu.start(); 
            }
            else if(choice == 4) {
                // TODO generate test data, this must not be part of final version
            }
            else {
                writeEnd();
                exit = true;
            }//end else
        }//end while
    }
    
    private int writeMainMenu(){
        TextOptions menu = new TextOptions("\n ***Main menu***", "Quit the program");
        menu.addOption("Borrower menu");
        menu.addOption("DVD menu");
        menu.addOption("Loan menu");
        menu.addOption("Generate test data");
        return menu.prompt();
    }
    
    private void writeEnd() {
        System.out.println(" Thank you and goodbye ");
    }
}
