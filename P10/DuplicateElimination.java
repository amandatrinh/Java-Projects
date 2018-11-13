package P10;

/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class DuplicateElimination
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
        int[] array = new int[5];
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( "Enter a number between 1-25 inclusive: " );
            int number = input.nextInt();
            if ( number == array[0] || number == array[1] || number == array[2] ||
                 number == array[3] || number == array[4] || 
                 number < 1 || number > 25 ) 
            {
                 System.out.println( "That is a Duplicate Number or INVALID!!!" );
                 i--; // to account for a "BAD" number inputted
            } // end if, to check if number is a duplicate or not in range
            else array[i] = number; // if number is valid
        } // end for loop for input
        
        System.out.println( "\nNumbers in array: " );
        for( int finalArray : array ) 
            System.out.print( finalArray + " " ); // prints output of final array
    } // end main method
} // end class P10C Duplicate Elimination