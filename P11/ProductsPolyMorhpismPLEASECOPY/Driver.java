package P11.ProductsPolyMorhpismPLEASECOPY;

import java.util.Scanner;
public class Driver
{

  public static void main (String args[] )  
  {
    
    int countB= 0, countD = 0, countC = 0; 
    String type = "";
    
    /* instantiate Book objects */ 
    
    Book b0 = new Book(1001, "Susan Collins", "The Hunger Games", 12.99, true);  // create a book object
    Book b1 = new Book(1002, "Stephan King", "Kujo", 11.95, false);
    Book b2 = new Book();
    
    
    /* instantiate DVD objects */ 
    
    DVD d0 = new DVD(3001, "Jennifer Lee", "Frozen", 39.99, true);         
    DVD d1 = new DVD(3002, "George Lucas", "Star Wars", 59.32, false);
    
    /* instantiate CompactDisc objects */
    
    CompactDisc c0 = new CompactDisc(5001, "Taylor Swift", "1989", 19.99, true);
    CompactDisc c1 = new CompactDisc(5002, "Ariana Grande", "My Everything", 14.99, false);
    CompactDisc c2 = new CompactDisc();
    
    
    Products [] kind = new Products[8];  // creates an array of 8 objects that can hold object of type Products
    
    
    /* assigns objects to array called products(name of abstract class) */
    
    
    kind [0] = b0;
    kind [1] = b1;
    kind [2] = b2;
    kind [3] = d0;       
    kind [4] = d1;
    kind [5] = c0;
    kind [6] = c1;
    kind [7] = c2;
    
    
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter what type of prouduct you are looking for.(book or dvd or cd)");
    type = reader.nextLine();
    
                                // user input to decide if user is looking for a book, cd, or dvd
    if (type.equalsIgnoreCase("book"))   // looks for book if user types in book
    {
        for (int i=0; i < kind.length; i++) // prints status of book then goes to  toString()
        {
            if (kind[i] instanceof Book)
            {
                countB++;
                System.out.println( kind[i] );
            }
            
        } // end for loop
    System.out.println("number of books = " + countB); // counts number of books
    
    }// end if
    
    
    if (type.equalsIgnoreCase("dvd")) // looks for dvd if user types in dvd
    {
        for (int i=0; i < kind.length; i++) // prints status of DVD's then goes to toString()
        {
            if (kind[i] instanceof DVD)
            {
                countD++;
                System.out.println( kind[i] );
            }
        } // end for loop
     System.out.println("number of DVD's = " + countD); // counts number of dvd's
    }// end if
    
 
    if (type.equalsIgnoreCase("cd")) // looks for compactdisc if user inputs cd
    {
        for (int i=0; i < kind.length; i++) // prints status of CompactDisc's then goes to toString()
        {
            if (kind[i] instanceof CompactDisc)
            {
                countC++;
                System.out.println( kind[i] );
            }
        } // end for loop
     System.out.println("number of DVD's = " + countC); // counts number of compact discs
    }// end if
    } // end main method
    
}