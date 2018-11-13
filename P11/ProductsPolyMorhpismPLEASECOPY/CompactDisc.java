package P11.ProductsPolyMorhpismPLEASECOPY;

/*
 * Amanda Trinh
 * Period 3
 */
public class CompactDisc extends Products
{
    String artist; // creates artist instance variable unique to this subclass
    
    public CompactDisc(int c, String a, String d, double p, boolean av)
    // inherited from the superclass
    {
         code = c;
         artist = a;
         description = d;
         price = p;
         available = av;
    } // end constructor method
    
    public CompactDisc()
    {
         artist = "not specified";
    } // end method if the constructor expected no data
    
    public boolean isAvailable()
    {
        return available;
    } // ends method from abstract class
  
    public String toString()
    {
        return super.toString() +
              "Artist: " + artist +  "\n"; //adds to the toString in the Abstract class to print Artist too
    } // end toString method
    
} // end class Products
