package tui;

import java.util.Scanner;
/**
 * Description of TextInput goes here.
 * 
 * @author Istvan Knoll, Mogens Holm Iversen
 * @version 0.0.1 initial draft version
 */
public class TextInput {
    // instansvariables 

    /**
     * Constructor for objects of TextInput
     */
    public TextInput() {
        // initialise instansvariables
    }
    

    //other methods
    public static int inputNumber(String question){   
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        printQuesiton(question);
        while (!keyboard.hasNextInt()){
            System.out.println("Input must be a number - try again");
            keyboard.nextLine();
        }
        number = keyboard.nextInt();
        return number;
    }
    
    public static String inputString(String question) {
        Scanner keyboard = new Scanner(System.in);
        printQuesiton(question);
        return keyboard.nextLine();
    }
    
    private static void printQuesiton(String question) {
        System.out.print(" " + question + ": ");
    }

}
