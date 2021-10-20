package bookstore;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Hannes
 */
public class Menu
{
    public static void readInput()
    {
        String input = null;
        int number = 0;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Not a number!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
