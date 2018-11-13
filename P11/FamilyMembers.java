package P11;

import java.util.ArrayList;
/*
 * Amanda Trinh
 * Period 3
 */
public class FamilyMembers 
// holds my family members' names in an ArrayList
{
    public static void main( String args[] )
    {
        ArrayList<String> names = new ArrayList<String>(); // instantiates an ArrayList to populate names
        names.add( new String( "Amanda" ) );
        names.add( new String( "Celine" ) );
        names.add( new String( "Darlene" ) );
        names.add( new String( "Sandy" ) );
        names.add( new String( "Hy" ) );
        names.add( new String( "Crispy" ) );
        
        /* Print the number of elements in the ArrayList using the ArrayList  “.size()” method. */
        System.out.println( "My Family Members! \n\n" + 
                            "The size of the ArrayList is: " + names.size() );
        
        /* Use a for loop to traverse the ArrayList and print the name of each person on a separate line. */
        for ( int index = 0; index < names.size(); index++ )
        {
            System.out.println( names.get(index) );
        } // end for loop to print out the objects in the ArrayList
        
        /* Use a separate for-each loop to traverse the ArrayList and print the name of each person on a separate line. */
        System.out.println( "\n\nMy Family Members AGAIN! " );
        for( String element : names)
        {
            System.out.println( element );
        } // end for-each loop to print out the objects in the ArrayList
    } // end main method
} // end class FamilyMembers