package bookstore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hannes
 */

//Handles the order
public class Order
{
    private List<Book> bookList;
    
    public Order()
    {
        bookList = new ArrayList<>();
    }
    
    void addBook(Book book)
    {
        bookList.add(book);
    }
    
    //Displays the books from the list
    public void listBooks()
    {
        for (Book book : bookList)
        {
            System.out.println(book.toString());
        }
    }
    
    private int boxesNeeded()
    {
        return (int) Math.ceil(bookList.size() / (double) 5);
    }
}
