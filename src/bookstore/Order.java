package bookstore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hannes
 */

//Handles the order and interacting with the user
public class Order
{
    private List<Book> inventory;
    
    public Order()
    {
        inventory = new ArrayList<>();
    }
    
    //Adds books to the list
    public void addBook()
    {
        inventory.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, 10.99 ));
        inventory.add(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 251, 20.99));
        inventory.add(new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 317, 30.99));
        inventory.add(new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 636, 40.99));
    }
    
    //Displays the books from the list
    public void listBooks()
    {
        for(int i = 0; i < inventory.size(); ++i)
        {
            System.out.println(inventory.get(i).toString());
        }
    }
    
}
