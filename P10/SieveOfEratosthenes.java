package P10;

/*
 * Amanda Trinh
 * Period 3
 */
public class SieveOfEratosthenes
{
    public static void main( String args[] )
    {
        boolean [] array = new boolean[1000];
        for ( int i = 0; i < array.length; i++ ) array[i] = true; // set all elements to true
        for ( int number = 2; number < array.length; number++ ) // excludes 0 and 1
        {
             for ( int j = number + 1; j < array.length; j++ )
             {
                    if ( (j % number) == 0 ) array[j] = false;
             } // end for loop
        } // check if element is prime or not
        
        System.out.println( "These are the prime numbers from 1-1000." );
        int counter = 0; // used to keep track of prime numbers printed
        for ( int i = 2; i < array.length; i++ )
        {
             if ( array[i] == true ) 
             {
                 System.out.print( i + " " );
                 counter++;
             } // prints out prime numbers
             if ( counter == 20 )
             {
                 System.out.println( "" );
                 counter = 1;
             } // creates neat rows of prime numbers
        } // end print output for loop for prime numbers in array
    } // end main method
} // end class P10D