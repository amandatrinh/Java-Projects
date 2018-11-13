package P11.ProductsPolyMorhpismPLEASECOPY;

public class Book extends Products
{
  String author;   //create instance variable unique to this class
  
  public Book(int c, String a, String d, double p, boolean av)  // constructor  notice that code, description, and price do NOT need to be created 
                                // they are automatically inherited from the superclass
  {
  code = c;
  author = a;
  description = d;
  price = p;
  available = av;
  }
  public Book()
  {
      
   author = "not specified";
  }
    
  public boolean isAvailable()
    {
        return available;
    } //end method
  
    public String toString()
    {
        return super.toString() +  //use toString in superclass "Products".
              "Author: " + author +  "\n";   //append toString in Abstract class to include Author;
        
    } // end toString method
    
} // end class Products