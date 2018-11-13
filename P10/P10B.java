package P10;
/*
 * Amanda Trinh
 * Period 3
 */
public class P10B // Michael Jackson
{
    public static void main( String args[] )
    {
        String[] artist = { "Broods", "Echosmith", "Arctic Monkeys" };
        int i = (int)(Math.random()*3);
        artist[i] = "Michael Jackson";
        for ( int search = 0; search < artist.length; search++ )
        {
            if ( artist[search] == artist[i] )
            {
                System.out.println( "We found Michael!");
                break;
            } // end if found Michael Jackson
            else
                System.out.println( "No Michael in artist[" + search + "]" );
        } // end for loop to search for index of Michael
    } // end main method
} // end class Project 10B