package P11.ProductsPolyMorhpismPLEASECOPY;

public class DVD extends Products  
{
 String director;    // create instance variables unique to this class
  
   public DVD(int c, String di, String d, double p, boolean a)
   { 
    code = c;
    director = di;
    description = d;
    price = p; 
    available = a;
     
    }// end DVD
   public DVD()  // constructor -  notice that code, description, and price do NOT need to be created 
                                // they are automatically inherited from the superclass
    {
        
    director = "not specified";
    price = 0;
    }
  
    public boolean isAvailable()
    {
        return available;
    } //end method
    
    public String toString()
    {
        return super.toString() +               //use toString in superclass "Products".
              "Director: " + director +  "\n";   //append toString in Abstract class to include Author;
        
    } // end toString methodd toString method
    
} // end class Products