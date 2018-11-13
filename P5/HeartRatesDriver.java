package P5;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.*;
public class HeartRatesDriver
{
    public static void main( String args[] )
    {
        Scanner reader = new Scanner(System.in);
        System.out.println( "Please enter your first name: " );
        String firstname = reader.nextLine();
        System.out.println( "Please enter your last name: " );
        String lastname = reader.nextLine();
        System.out.println( "Please enter your birth month (1-12): " );
        int birthmonth = reader.nextInt();
        System.out.println( "Please enter your birth day (1-31): " );
        int birthday = reader.nextInt();
        System.out.println( "Please enter your birth year (####): " );
        int birthyear = reader.nextInt();
        
        HeartRates user = new HeartRates( firstname, lastname, birthmonth, birthday, birthyear );
        System.out.println(user); // print form toString() method
    } // end main method    
} // end class HeartRates Driver