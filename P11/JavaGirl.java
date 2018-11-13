package P11;
/*
 * Amanda Trinh
 * Period 3
 */
public class JavaGirl extends SuperHero
{
    String suitColor;
    String motto;
    boolean hasCape;
    
    public JavaGirl( String c, boolean cape, String m )
    {
        suitColor = c;
        hasCape = cape;
        motto = m;
    } // end JavaGirl constructor
    
    public String getSuitColor()
    {
        return suitColor;
    } // end method setSuitColor
    
    public boolean isCaped()
    {
        return hasCape;
    } // end method isCaped
    
    public String motto()
    {
        return motto;
    } // end abstract method motto()
    
    public String toString()
    {
        return "SuitColor: " + getSuitColor() + "\n" +
               "Wears a Cape?: " + isCaped() + "\n" +
               "Motto: " + motto() + "\n";
    } // end toString method
} // end class definition JavaGirl