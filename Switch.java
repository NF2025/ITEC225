
import java.util.Scanner;

/**
 * ITEC 120 - Demonstrates sing a switch structure with a string value. Also
 *              shows how to return a string from a method
 *
 * @author Jeffrey LaMarche
 *
 * @version 1.0 2021-09-23
 * Initial Version
 */
public class Switch
{
    /**
     * The main method for the entire program
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args)
    {
        final String POTATO = "potato";
        final String EGGPLANT = "eggplant";
        final String APPLE = "apple";
        final String KIWI = "kiwi";

        System.out.println();
        String userInput = getFruitOrVeggie();

        switch( userInput )
        {
            case POTATO:
            case EGGPLANT:
                System.out.println("That's a vegetable!");
                break;

            case APPLE:
            case KIWI:
                System.out.println("That's a fruit!");
                break;

            default:
                System.out.println("I don't know what that is!");
                break;
        }

        System.out.println();
    }

    /**
     * Asks the user to enter a fruit or vegetable, returing their input
     *
     * @return a string (not exactly) containing the user input
     */
    public static String getFruitOrVeggie()
    {
        Scanner input = new Scanner(System.in);
        String userText = "";

        System.out.print("Enter a fruit or veggie: ");
        userText = input.nextLine();

        return userText;
    }
}
