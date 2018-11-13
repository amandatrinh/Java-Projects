import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/*
 * Amanda Trinh
 * Period 3
 */
public class Driver
{
    /**
     * Main description of this method is to print out the Transcript entirely according to user.
     * Calculates and prints out GPA.
     * @return technically returns nothing since it is a void method...
     */
    public static void main( String args[] ) throws IOException
    {
        /* instantiate Regular objects */
        Regular r0 = new Regular( "Health", "A", false );
        Regular r1 = new Regular( "World History", "A", false );
        
        /* instantiate Honors objects */
        Honors h0 = new Honors( "Biology", "B" );
        Honors h1 = new Honors( "Human Geography", "A" );
        
        /* instantiate AP objects */
        AP a0 = new AP( "Macroeconomics", "A", 5 );
        AP a1 = new AP( "Latin", "F", 2 ); 
        AP a2 = new AP( "Calculus BC", "B", 5 );
        
        /* Add each course to an ArrayList called "classes" */
        ArrayList<Transcript> classes = new ArrayList<Transcript>();
        classes.add(r0);
        classes.add(r1);
        classes.add(h0);
        classes.add(h1);
        classes.add(a0);
        classes.add(a1);
        classes.add(a2);

        /**
         * Creates scanner object and asks for user input if they want to know if AP courses are available for their courses.
         * Takes the input to correctly identify which "type" of Transcript they would like.
         * Output will be of the Transcript type objects.
         */
        Scanner input = new Scanner( System.in ); // creates scanner object to get user input
        System.out.println( "Would you like to see available AP (Y/N) ?" );
        String user = input.nextLine();
        System.out.println( "Transcript:" );
        if ( user.equalsIgnoreCase("N") )
        {
            for( Transcript element : classes )
            {
                System.out.println( element + "\n" );
            } // end for-loop prints out ArrayList
        } // if user wants "plain" Transcript without output of available AP courses
        else
        {
            for( int index = 0; index < classes.size(); index++ )
            {
                System.out.println( classes.get(index) );
                if( classes.get(index) instanceof Regular || classes.get(index) instanceof Honors)
                {
                    if( classes.get(index) == r0 )
                    {
                        System.out.println( r0.iseligibleAP() );
                    } // end if to output r0.iseligibleAP()
                    if( classes.get(index) == r1 )
                    {
                        System.out.println( r1.iseligibleAP() );
                    } // end if to output r1.iseligibleAP()
                    if( classes.get(index) == h0 )
                    {
                        System.out.println( h0.iseligibleAP() );
                    } // end if to output h0.iseligibleAP()
                    if( classes.get(index) == h1 )
                    {
                        System.out.println( h1.iseligibleAP() );
                    } // end if to output h1.iseligibleAP()
                } // end if found a Regular/Honors course
                System.out.println( "" );
            } // end for loop that prints out full Transcript output  with available AP courses
        } // end else if user wants Transcript with available AP courses
        
        /**
         * Wraps all object class methods for getGradePoint()
         * Assigns all wrapped double values to a variable
         */
        Double p1 = new Double( r0.getGradePoint() );
        Double p2 = new Double( r1.getGradePoint() );
        Double p3 = new Double( h0.getGradePoint() );
        Double p4 = new Double( h1.getGradePoint() );
        Double p5 = new Double( a0.getGradePoint() );
        Double p6 = new Double( a1.getGradePoint() );
        Double p7 = new Double( a2.getGradePoint() );
        double a = p1.doubleValue(), b = p2.doubleValue(), c = p3.doubleValue(), d = p4.doubleValue(),
               e = p5.doubleValue(), f = p6.doubleValue(), g = p7.doubleValue();
        
        /**
         * Calculate/get GPA points from all courses according to the wrapped double objects
         * Outputs cumulative GPA of user
         */
        double GPA = 0;
        GPA = a + b + c + d + e + f + g; // sum of all grade points earned from the courses
        GPA = GPA/classes.size(); // calculates GPA 
        System.out.println( "Your GPA is " + GPA ); // outputs GPA
    } // end main method
} // end class Driver