package P11.ProductsPolyMorhpismPLEASECOPY;

public abstract class Products
{
   protected int code;   // create instance variables - protected variables can only be accessed by subclasses
   protected double price;              // and private variables would NOT be accessable from outside class
   protected String description;
   protected boolean available;
   
   public abstract boolean isAvailable();  //abstract method - requires all child classes to use it
   
   Products()  // constructor - inititalizes intances variables
    {
   code = 0;
   price = 0;
   description = "none";
   }
    
    
    public String toString()
    {
        return  "Code: " + code + "\n" +
                "Description: " + description + "\n" + 
                "Price: "  + "$" + price + "\n" +
                "Available: " + isAvailable() + "\n";
        
    } // end toString method
    
} // end class Products