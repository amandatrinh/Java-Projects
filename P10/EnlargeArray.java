package P10;
/*
 * Amanda Trinh
 * Period 3
 */
public class EnlargeArray
{
    public static void main( String args[] )
    {
        int [] array = { 1, 2, 3, 4, 5 }; // instantiate orig. array
        int [] newArray = new int[10]; // larger "Resized" array
        System.out.print( "originalArray = " );
        for ( int i = 0; i < array.length; i++ )
        {
            System.out.print( array[i] + " " );
            newArray[i] = array[i]; // writes smaller array to larger one
        } // end for loop to print original array and "resize" it
        
        System.out.print( "\noriginalArray = " );
        for ( int element : newArray )
        {
            System.out.print( element + " " );
        } // end for loop to print "resized" array
    } // end main method
} // end class P10F - Enlarge Array
