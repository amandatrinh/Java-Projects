package P10;

public class XZeroes
{
    public static void main( String[] args)
    {
        int [][] array = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };
        /**
         * INDICES of 2D array:
         * [0][0] [0][1] [0][2] [0][3]
         * [1][0] [1][1] [1][2] [1][3]
         * [2][0] [2][1] [2][2] [2][3]
         * [3][0] [3][1] [3][2] [3][3]
         */
        for( int r = 0; r < array.length; r++ )
        {
            array[r][r] = 0;
            array[r][3-r] = 0;
        }
        for( int [] a : array )
        {
            for( int b : a )
            {
                System.out.print( b + "\t" );
            }
            System.out.println("\n");
        }
        
        
    }
}
