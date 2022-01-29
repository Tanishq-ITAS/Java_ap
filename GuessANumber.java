
/**
 * Example from slides and Chapter 4 - ask the user to guess a number.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessANumber
{

    public static void main(String args[]) {

        Random randomNumbers = new Random();
        int random = randomNumbers.nextInt(10);
        random++;
        
        
        System.out.println("Guess a number ");
        Scanner keyboard = new Scanner(System.in);
        

        int guess = keyboard.nextInt();
        if (random== guess) {
            System.out.println("correct");
        } else { 
            System.out.println("Nope you are wrong !"+ "\nThe number is " + random);
        }
        int diff = Math.abs(random - guess);
        System.out.println("You were off by "+ diff);

        
        // Generate a random number - see the directions in slides.
        // ask the user to guess a number etc.
    }
}
