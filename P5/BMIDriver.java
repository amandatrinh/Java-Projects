package P5;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class BMIDriver
{
    public static void main (String args [])
    {   
        int type;
        Scanner reader = new Scanner (System.in);
        while (true)
        {   
            System.out.println( "Enter 1 to enter Pounds/Inches or 2 for Kilograms/Centimeters: ");
            type = reader.nextInt();
            if (type != 1 && type != 2) 
            {
                System.out.println( "\nSTOP!!! QUIT/Invalid type" );
                System.out.println( "You did not choose imperial or metric system!" );
                break;
            } // end if user inputs invalid measuring system, end program
            System.out.println( "Enter weight: " );
            double weight1 = reader.nextDouble();
            System.out.println( "Enter height: " );
            double height1 = reader.nextDouble();
            int calcBMI1 = (int)((weight1*703)/(height1*height1));
            int calcBMI2 = (int)((weight1*10000)/(height1*height1));
            if ( type == 1)
            {
                BMI User = new BMI( weight1, height1 );
                System.out.println( "\nYour BMI is: " + calcBMI1 );
                User.setBMI(calcBMI1);
                System.out.println( User );
            } // end if, calculate BMI for Lbs/Inches
            if (type == 2)
            {
                BMI User = new BMI( weight1, height1 );
                System.out.println( "\nYour BMI is: " + calcBMI2 );
                User.setBMI(calcBMI2);
                System.out.println( User );
            } // end if, calculate BMI for Kgs/cms
        } // end while loop for testing user's BMI
    } // end main method
} // end class BMIDriver