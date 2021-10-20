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
    
    public Book (String title, String author, int nrOfPages, double price)
    {
        this.title = title;
        this.author = author;
        this.nrOfPages = nrOfPages;
        this.price = price;
    }
    
    //Setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setNrOfPages(int nrOfPages)
    {
        this.nrOfPages = nrOfPages;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    
    //Getters
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getNrOfPages()
    {
        return nrOfPages;
    }

    public double getPrice()
    {
        return price;
    }
    
    @Override
    public String toString()
    {
        return "(" + title + ", " + author + ", "
                + price + ", " + nrOfPages + ")";
    }
    
}
