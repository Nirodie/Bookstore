package bookstore;

/**
 *
 * @author Hannes
 */

//Creating and storing books
public class Book
{
    String title;
    String author;
    int nrOfPages;
    double price;
    double weight;
    int index;
    
    public Book (int index, String title, String author, int nrOfPages, double price, double weight)
    {
        this.title = title;
        this.author = author;
        this.nrOfPages = nrOfPages;
        this.price = price;
        this.weight = weight;
        this.index = index;
    }
    
    //Getters
    public double getPrice()
    {
        return price;
    }

    public double getWeight()
    {
        return weight;
    }
  
    @Override
    public String toString()
    {
        return "(" + title + ", Author: " + author + 
                ", Number of pages: " + nrOfPages + ", Price: " + price + ")";
    }
}
