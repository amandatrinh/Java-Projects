public class SearchArray
{
    /* Method to search an Integer Array */
    
    public int searchInt ( int intArray[], int sValue )
    {
        for ( int i = 0; i < intArray.length; i++ )
        {
            if ( intArray[i] == sValue )
                return i;
        } // end for loop
        return -1;
    } // end method
    
    /* Method to search a String Array */
    
    public int searchString ( String SArray[], String name )
    {
        for (int i = 0; i < SArray.length; i++ )
        {
            if ( SArray[i].equalsIgnoreCase(name) )
                return i;
        } // end for loop
        return -1;
    }
} // end class SearchArray