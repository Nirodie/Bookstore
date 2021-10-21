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
    int orderNbr;

    public Order(int orderNbr)
    {
        //Generates a random number when the constructor is called and stores it in orderNbr
        //So it can be used as the order number
        this.orderNbr = (int)(Math.random() * 7000 + 4000);
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
    public double bookPrice()
    {
        double total = 0;
        for (Book book : bookList)
        {
            total = total + book.getPrice();
        }
        return Math.round(total);
    }
    
    //Calculates the price of the books
    public double totalWeight()
    {
        double total = 0;
        for (Book book : bookList)
        {
            total = total + book.getWeight();
        }
        return Math.round(total);
    }
    
    public void displayOutput()
    {
        System.out.println("\nYour order number is: " + orderNbr);
        System.out.println("The price of the books is : " + bookPrice() + "kr");
        System.out.println("The total weight of your order is: " + totalWeight() + "kg");
        System.out.println("The price of the shipping is: " + deliveryFee() + "kr");
        System.out.println("The total price is: " + totalPrice() + "kr\n");
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
    private double deliveryFee()
    {
        double boxes = boxesNeeded();

        return boxes > 5 ? (150 * 5) + ((boxes - 5) * 90) : boxes * 150;
    }
    
    //Gives the total price for books + delivery
    public double totalPrice()
    {
        double total;
        
        total = deliveryFee() + bookPrice();
        
        return Math.round(total);
    }
    
}
