package P10;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class TimesTable
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter the number of rows you would like: " );
        int r = input.nextInt();
        System.out.println( "Enter the number of columns you would like: " );
        int c = input.nextInt();
        int [][] table = new int[r][c];
        System.out.println( "\t\t Multiplication Table (Using 2-D Array)" );
        for ( int row = 1; row <= table.length; row++ )
        {
            for ( int column = 1; column <= table.length; column++ )
            {
                int number = row * column; // used to set elements into array
                table[(row-1)][(column-1)] = number; // element index starts at 0!
                System.out.print( table[(row-1)][(column-1)] + "\t" );
            } // end for loop to fill array
            System.out.print( "\n" );
        } // end for loop
    } // end main method
} // end class