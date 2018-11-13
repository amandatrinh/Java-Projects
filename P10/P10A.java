package P10;
/*
 * Amanda Trinh
 * Period 3
 */
public class P10A
{
    public static void main( String args[] )
    {
        int[] array = new int[10];
        int i = 0; // keeps track of index of array
        int counter = 0; // keeps track of positive numbers
        for ( i = 0; i < array.length; i++ )
        {
            int j = (int)(Math.random()*201) - 100; // number from -100 to 100
            array[i] = j;
        } // end for loop instantiate random numbers into array
        while (true)
        {
            System.out.println( "Numbers in array: " );
            for ( i = 0; i < array.length; i++ )
                {
                    System.out.print( array[i] + " " );
                } // print out each number in array
            System.out.println( "\n\nALL Positive integers in array: " );
            for ( i = 0; i < array.length; i++ )
            {
                if ( array[i] >= 0 ) 
                {
                    System.out.print( array[i] + " " );
                    counter++;
                } // end if and counts number of positive integers in array
            } // print out each positive integer in array  
            System.out.println( "\n\nThere are " + counter + " positive integers." );
            break;
        } // end while loop to print output
    } // end main method
} // end class P10A