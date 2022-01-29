//importing required packages
import java.util.Scanner;

/**
 * Display Roman Numeral Using SWITCH/CASE statement.
 */
public class RomanCase {

    /**
     * Main entry point into this application
     *
     * @param args No arguments required at run-time
     */
    public static void main(String[] args) {
        // Creating an object for the user
        Scanner s = new Scanner(System.in);
        int number;

        // Prompt the user
        System.out.print("Please enter a number"+"Range of 1-10");

        // Get user input and assign to a variable
        number = s.nextInt();

        // Insert a SWITCH / CASE statement
        switch (number){
            //case 1 
            case 1:
            System.out.println("I");
            break;
            //case2
            case 2:
            System.out.println("II");
            break;
            //case3
            case 3:
            System.out.println("III");
            break;
            //case4
            case 4:
            System.out.println("IV");
            break;
            //case5
            case 5:
            System.out.println("V");
            break;
            //case6
            case 6:
            System.out.println("VI");
            break;
            //case7
            case 7:
            System.out.println("VII");
            break;
            //case8
            case 8:
            System.out.println("VIII");
            break;
            //case9
            case 9:
            System.out.println("IX");
            break;
            //case10
            case 10:
            System.out.println("X");
            break;
            //
            default:
            System.out.println("Invalid number");

        }

        // switch number .. case its 1 then print 'I', etc, etc
        
    }
}
