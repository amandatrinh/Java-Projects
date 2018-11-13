package Cipher;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class ExponentCaesarCipher
{
    public static void main ( String [] args )
    {
        System.out.print( "This program uses a Caesar cipher for encryption but using \"exponentials.\" \n" ); 
        System.out.println( "Example to encrypt type 10 and 10 and to decrypt type -10,10 \n" );
        
        String [] array = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
                          "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                          "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
                          "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                        
        Scanner input = new Scanner ( System.in );
        System.out.print( "Enter a sentence: " );
        String sentence = input.nextLine();
        System.out.print( "Enter encryption key base (any positive number): " );
        int base = input.nextInt();
        System.out.print( "Enter encryption key power (any positive number): " );
        int power = input.nextInt();
        System.out.print( "Plain text: " + sentence + "\n" ); // prints out original sentence
        
        /* Create KEY */
        int key = (int)Math.pow( base, power );
        
        String[] ciphertext = new String[sentence.length()];
        for( int i = 0; i < sentence.length(); i++ )
        {
            ciphertext[i] = sentence.substring(i,i+1);
        } // sets user inputted sentence to an array
        
        /* ENCRYPTION*/
        System.out.print( "Ciphertext: " );
        for ( int i = 0; i < sentence.length(); i++ )
        {
            for ( int j = 0; j < 26; j++ )
            {
                if ( (sentence.substring(i, i+1)).equalsIgnoreCase(array[j]) )
                {
                    ciphertext[i] = array[j + (key%26)];
                }
            } // end search array
            System.out.print( ciphertext[i] );
        } // encrypts and prints the user inputted sentence
        
        /* DECRYPTION */
        System.out.print( "\n\nEnter decryption key base (any number): " );
        base = input.nextInt();
        System.out.print( "Enter decryption key power (any positive number): " );
        power = input.nextInt();
        key = (int)Math.pow( base, power );
        
        if ( key > 0 ) key = -1 * key;
        
        System.out.print( "Ciphertext: " );
        for ( int i = 0; i < ciphertext.length; i++ )
        {
            for ( int j = 26; j < array.length; j++ )
            {
                if ( (ciphertext[i]).equalsIgnoreCase(array[j]) )
                {
                    ciphertext[i] = array[j + (key%26)];
                    j = array.length-1; // makes sure to end this nested for loop only!
                }
            } // end for loop to set ciphertext
            System.out.print( ciphertext[i] );
        } // decrypts and prints out the sentence
    } // end main method
} // end Exponential Caesar Cipher class
