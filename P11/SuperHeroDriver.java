package P11;
import java.util.ArrayList;
/*
 * Amanda Trinh
 * Period 3
 */
public class SuperHeroDriver
{
    public static void main( String args[] )
    {
        /* instantiate AsteroidMan object */ 
        AsteroidMan a0 = new AsteroidMan( "Dirty-Space Brown", false, "Rockin' Roll");  // create a AsteroidMan object
        
        /* instantiate JavaGirl object */ 
        JavaGirl j0 = new JavaGirl( "BlueJ Shade", true, "Coding Equality" );  // create a JavaGirl object
        
        /* instantiate Divisor object */ 
        Divisor d0 = new Divisor( "Jet Black", false, "Breaking down fractions at the speed of light!" );  // create a Divisor object
        
        
        /* Add each Superhero to an ArrayList called “heroes” 
         * prints each superhero’s suitColor, hasCape instance variable, and motto using a for-each loop. 
         */
            // Use polymorphism!!! //
            ArrayList<SuperHero> heroes = new ArrayList<SuperHero>(); // instantiates an arraylist called heroes
            heroes.add(a0);
            heroes.add(j0);
            heroes.add(d0);
            System.out.println( "ORIGINAL SET OF ArrayList OF HEROES..." );
            for( SuperHero element : heroes )
            {
                System.out.println( element );
            } // end for-each loop to print heroes ArrayList
            
        
        /* Creates a 3x3 2D array to hold any capedHeroes
         * Also removes the capedHeroes from the original ArrayList
         */
        SuperHero [][] capedHeroes = new SuperHero[3][3];
        int r = 0, c = 0; // instantiates the rows and columns index for the 2D array
        for( int index = 0; index < heroes.size(); index++ )
        {
            if( (heroes.get(index)).isCaped() == true )
            {
                if ( c > 2 )
                {
                    r++;
                    c = 0;
                } // ensures proper index for capedHeroes array
                capedHeroes[r][c] = heroes.get(index);
                heroes.remove(index); // removes capedHero from ArrayList when found
                c++;
                index--; // makes sure to check the same index due to the removal of an object in ArrayList
            } // end if found a caped Hero
            if ( index == heroes.size() - 1 )
            {
                if ( c > 2 )
                {
                    r++;
                    c = 0;
                } // ensures proper index for capedHeroes array
                capedHeroes[r][c] = null;
                c++;
            } // fills rest of 2D array with null
        } // end for loop
        
        
        /* Prints out capedHeroes 2D array */
        System.out.println( "\n\nPRINTING CONTENTS OF capedHeroes..." );
        for( int row = 0; row < capedHeroes.length; row++ )
        {
            for( int column = 0; column < capedHeroes[0].length; column++ )
            {
                System.out.println( capedHeroes[row][column] );
            } // end nested-for loop
        } // end for loop
        
        
        /* Prints out remaining heroes/notCaped in ArrayList to verify */
        System.out.println( "\n\nREMAINING SUPERHEROES IN ORIGINAL heroes ArrayList..." );
        for( SuperHero element : heroes )
        {
            System.out.println( element );
        } // end for-each loop to print heroes ArrayList
    } // end main method
} // end class SuperHeroDriver
