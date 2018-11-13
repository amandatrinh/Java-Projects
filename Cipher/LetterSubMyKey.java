package Cipher;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class LetterSubMyKey
{
    public static void main( String[] args )
    {
        System.out.println( "This program implements a letter-substitution cipher.\n" );
        
        String [] abc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
                        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String [] array = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D",
                          "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V" ,"B", "N", "M" };
        
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a sentence: " );
        String str = input.nextLine();
        String[] ciphertext = new String[str.length()]; // creates new array for cipher text
        System.out.print( "Plain text: " + str + "\n" ); // prints out original sentence
        
        System.out.print( "Ciphertext: " );
        for( int i = 0; i < str.length(); i++ )
        {
            ciphertext[i] = str.substring(i,i+1);
        } // sets user inputted sentence to an array
        for( int i = 0; i < str.length(); i++ )
        {
            for( int j = 0; j < abc.length; j++ )
            {
                if( (str.substring(i,i+1)).equalsIgnoreCase(abc[j]) )
                {
                    ciphertext[i] = array[j];
                }
            } // creates the ciphered text
            System.out.print( ciphertext[i] );
        } // creates and prints out cipher text
        
        /* DECRYPTION */
        String[] decryption = new String[ciphertext.length]; // creates new array for decryption text
        System.out.print( "\nDecryption: " );
        for( int i = 0; i < ciphertext.length; i++ )
        {
            for( int j = 0; j < array.length; j++ )
            {
                if( ciphertext[i].equals(array[j]) )
                {
                    decryption[i] = abc[j];
                }
            } // creates the decrypted text by searching through the 26-key
            System.out.print( decryption[i] );
        } // creates and prints out decrypted cipher text
    } // end main method
} // end class Letter-Substitution with its own key
