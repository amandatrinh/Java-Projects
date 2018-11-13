package P11;
import java.util.ArrayList;
/*
 * Amanda Trinh
 * Period 3
 */
public class Schools
// creates an ArrayList of String objects that holds the names of the universities to which I am applying
{
    public static void main( String args[] )
    {
        ArrayList<String> schools = new ArrayList<String>(); // instantiates an ArrayList to populate school names
        schools.add( new String( "UCSD" ) );
        schools.add( new String( "UCLA" ) );
        schools.add( new String( "UCSB" ) );
        schools.add( new String( "NYU" ) );
        schools.add( new String( "Brown" ) );
        schools.add( new String( "Ann Arbor" ) );
        schools.add( new String( "Berkeley" ) );
        
        /* Print the number of elements in the ArrayList using the ArrayList  “.size()” method. */
        System.out.println( "The size of the ArrayList is: " + schools.size() );
 
        /* Use a separate for-each loop to traverse the ArrayList and print the name of each school on a separate line. */
        System.out.println( "\nSchools I will be applying too! " );
        for( String element : schools)
        {
            System.out.println( element );
        } // end for-each loop to print out the objects in the ArrayList
        
        /* Use a for loop (not a for each loop), to remove all the schools that have a length of 4. */
        for( int index = 0; index < schools.size(); index++ )
        {
            if ( (schools.get(index)).length() == 4 )
            {
                schools.remove(index);
                index--; // allows for us to check the same index again after removal
                         // must move back the index by one or a consecutive 4-letter school will NOT be removed
            } // end if 4-letter remove school
        } // end for loop
        
        /* Print the number of elements in the ArrayList using the ArrayList  “.size()” method. */
        System.out.println( "\nThe size of the ArrayList is " + schools.size() + " after removing the 4-letter schools.\n" );
        
        /* Prints the name of each school on a separate line AFTER REMOVAL. */
        for( String element : schools)
        {
            System.out.println( element );
        } // end for-each loop to print out the objects in the ArrayList AFTER REMOVAL
    } // end main method
} // end class Schools