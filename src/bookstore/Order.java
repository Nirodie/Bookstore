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
    
    //Adds books to the bookList
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
    
    //Calculates how many boxes that are needed for the shipping
    private int boxesNeeded()
    {
        return (int) Math.ceil(bookList.size() / (double) 5);
    }
    
    // Calculates how much the shipping will cost
    private int deliveryFee()
    {
        int boxes = boxesNeeded();
        
        return boxes > 5 ? (150 * 5) + ((boxes - 5) * 90) : boxes * 150;
    }
}
