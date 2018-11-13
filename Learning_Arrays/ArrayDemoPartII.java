public class ArrayDemoPartII
{
    public static void main( String args[] )
    {
        int [] array = { 5, 10, 20 };
        int sum = 0;
        int lastElement = 0;
        
        /* Enhanced for-loop example*/
        for ( int element : array )
        {
            sum += element;            
        } // end enhannced for loop
        System.out.println( "The sum total of elements in the array is: " + sum );
        
        System.out.println( "Last element in array: " + array[array.length-1] );
        
        /* 2-D Array Example */
        int[][] table = { { 1, 2, 3 }, 
                          { 4, 5, 6 }, 
                          { 7, 8, 9 }, 
                          { 10, 11, 12 } }; // 4 rows by 3 columns
        
        System.out.println( "The number of rows in table = " + table.length );
        
        System.out.println( "The number of columns in table = " + table[0].length );
                          
        // How do I print out 11?
        System.out.println( "11? " + table[3][1] ); // careful on how the computer index starts/counts at 0
        
        sum = 0;
        for ( int element : table[0] )
        {
            sum += element;
        }
        System.out.println( "The sum total of table[0]: " + sum );
        
        System.out.println( "The product of 3*7 is: " + table[0][2] * table[2][0] );
        
        /* Sum of all elements in table array */
        sum = 0;
        for ( int i = 0; i < table.length; i++ )
        {
            for ( int element : table[i] )
            {
                sum += element;
            }
        }
        System.out.println( "The sum total of table: " + sum );
    } // end main method
} // end class