public class SearchArrayDriver
{
    public static void main( String args[] )
    {
        String [] names = { "Amanda", "Sven", "Crispy", "Bob" };
        int [] value = { 7, 24, 25, 77, 32 };
        String [] newName = new String[4];
        System.out.println( newName );
        //WHAT HAPPEN WITH THE NEXT LINE(S) OF CODE?
        //System.out.println( names );      // prints out location in memory aka memory address of Array object
        //System.out.println( value[] );    // syntax error
        //System.out.println( names[2] );   // prints out index 2 or 3rd element; output: Crispy
        
        /* Example: Setting array equal to each other */
        newName = names; // when you put objects equal to each other, it will not create a copy
                         // but they will have the same memory object and are therefore the SAME object
                         // not two seperate arrays with equivalent holdings in it
        System.out.println( names );     // prints address
        System.out.println( newName );   // prints address
        names[3] = "BOO!"; // this will actually change the 3rd element of both arrays
                           // because they are the SAME array -- point to the same location
        System.out.println( names[3] );  // demonstarates that both arrays are the same
        System.out.println( newName[3] );
        
        /* Example: Passing Array as a parameter */
        
        SearchArray find = new SearchArray();
        
        int get = find.searchInt( value, 77 );
        
        if ( get != -1 )
            System.out.println( "The location of the number is at index: " + get );
        else
            System.out.println( "Sorry, number not found" );
        
        int get2 = find.searchString( names, "Casper" );
        
        if ( get2 != -1 )
            System.out.println( "The location of the name is at index: " + get2 );
        else
            System.out.println( "Sorry, name not found" );
    } // end main method
} // end class SearchArrayDriver