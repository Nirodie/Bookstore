package bookstore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hannes
 */
//Handles the user interface along with user inputs
public class Store
{

    private List<Book> inventory;
    Order order = new Order();

    public Store()
    {
        inventory = new ArrayList<>();
    }
    
    //Runs the program
    public void run()
    {
        bookToStore();
        mainMenu();
    }

    //Adds books to the inventory
    public void bookToStore()
    {
        inventory.add(new Book(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, 10.99, 0.4));
        inventory.add(new Book(2, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", 251, 20.99, 0.45));
        inventory.add(new Book(3, "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 317, 30.99, 0.55));
        inventory.add(new Book(4, "Harry Potter and the Goblet of Fire", "J.K. Rowling", 636, 40.99, 0.7));
    }

    //Reads inputs and catches non-int inputs and has a maximum int input
    //to prevent choosing a number that isn't in the list
    public int readInput(int maxNumber)
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        int choice;
        try
        {
            input = bufferedReader.readLine();
            choice = Integer.parseInt(input);
            if (choice < maxNumber)
            {
                return choice;
            }
            else
            {
                System.out.println("Number is not within range\n");
                return -1;
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Invalid input!\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    //Displays all the books from inventory with index number starting from 1
    public void listBooks()
    {
        int index = 1;
        for (Book book : inventory)
        {
            System.out.println((index++) + " " + book.toString());
        }
    }
    
    public void mainMenu()
    {
        int choice =-1;
        
        while (choice !=0)//0 to exit the loop
        {
            System.out.println("1) Choose books");
            System.out.println("2) View your order");
            System.out.println("0) Finalise your order\n");
            System.out.println("Your choice: ");
            
            choice = readInput(4); //Accepts 0-3 as valid inputs
            
            switch(choice)
            {
                case 1:
                {
                    bookChoice();
                    break;
                }
                case 2:
                {
                    order.listBooks();
                    order.displayWeightAndPrice();
                    break;
                }
                default: 
                {
                    System.out.println("You paid " + order.totalPrice() + " for your order");
                }
            }
        }
    }
    //Method for handling the user choices for choosing books
    public void bookChoice()
    {
        int choice = -1;

        while (choice != 0)//0 to exit the loop
        {
            listBooks();
            System.out.println("\nPlease choose a book or press 0 when you're finished");
            choice = readInput(5); //Accepts 0-5 as valid inputs 

            switch (choice)
            {
                case 1:
                {
                    order.addBook(inventory.get(0));
                    break;
                }
                case 2:
                {
                    order.addBook(inventory.get(1));
                    break;
                }
                case 3:
                {
                    order.addBook(inventory.get(2));
                    break;
                }
                case 4:
                {
                    order.addBook(inventory.get(3));
                    break;
                }
            }
        }
    }
}
