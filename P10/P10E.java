package P10;
/*
 * Amanda Trinh
 * Period 3
 */
public class P10E // Multiplication Table
{
    public static void main( String args[] )
    {
        int [][] table = new int[12][12];
        System.out.println( "\t\t Multiplication Table (Using 2-D Array)" );
        for ( int row = 1; row <= table.length; row++ )
        {
            for ( int column = 1; column <= table.length; column++ )
            {
                int number = row * column; // used to set elements into array
                table[(row-1)][(column-1)] = number; // element index starts at 0!
                System.out.print( table[(row-1)][(column-1)] + "\t" );
            } // end for loop to fill array
            System.out.print( "\n" ); // every 12x element "create" next row
        } // end for loop
    } // end main method
} // end class P10E