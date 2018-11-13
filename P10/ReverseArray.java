package P10;
/*
 * Amanda Trinh
 * Period 3
 */
public class ReverseArray
{
    public static void main( String args[] )
    {
        String [] array = { "This", "is", "the", "right", "direction" };
        System.out.println( "Before loop: " );
        for ( String element : array )
        {
                System.out.print( element + " " );
        } // end for loop to print out array
        System.out.println( "\n\n  ...abara cadabara...\n" );
        System.out.println( "After loop: " );
        for ( int i = 0; i < array.length/2; i++ )
        {
                String str = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = str;
        } // end for loop to reverse array
        for ( String element : array )
        {
                System.out.print( element + " " );
        } // end for loop to print out reverse array
    } // end main method
} // end class P10G - ReverseArray