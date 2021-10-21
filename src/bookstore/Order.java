package bookstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hannes
 */
//Handles the order and the fees
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

    //Calculates the price of the books
    public void totalPrice()
    {
        double total = 0;
        for (Book book : bookList)
        {
            total = total + book.getPrice();
        }
    }
    
    //Calculates the price of the books
    public void totalWeight()
    {
        double total = 0;
        for (Book book : bookList)
        {
            total = total + book.getWeight();
        }
    }

    //Calculates how many boxes that are needed for the shipping
    private int boxesNeeded()
    {
        return (int) Math.ceil(bookList.size() / (double) 5);
    }

    // Calculates how much the shipping will cost
    //1-5 boxes costs 150 SEK per box
    //6-50 boxes costs 90 SEK per box
    //Each box contains a maximum of 5 books
    private int deliveryFee()
    {
        int boxes = boxesNeeded();

        return boxes > 5 ? (150 * 5) + ((boxes - 5) * 90) : boxes * 150;
    }
}
