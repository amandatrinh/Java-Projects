import java.io.*;
import java.util.Scanner;
/*
 * Amanda Trinh
 * Period 3
 */
public class Regular extends Transcript implements CalculateGPA
{
    boolean isROP; // to get if course is an ROP course
    
    /**
     * Constructor class that initializes the variables course, lettergrade, and isROP
     * @param name of course (c), String course
     * @param grade (letter) received for course, String lettergrade
     * @param if course is an ROP course, boolean isROP
     */
    public Regular( String c, String letter, boolean ROP )
    {
        course = c;
        lettergrade = letter;
        isROP = ROP;
    } // end constructor method
    
    /**
     * Identifies Regular objects courses as unweighted courses
     * @return boolean isWeighted, false
     */
    public boolean setisWeighted() 
    {
        isWeighted = false;
        return isWeighted;
    } // method tells if course is weighted
    
    /**
     * According to String lettergrade, checks if user passed the course or not.
     * @return boolean credit, if user passed course or not
     */
    public boolean passClass()
    {
        if (lettergrade == "C" || lettergrade == "B" || lettergrade == "A" ) credit = true;
        else credit = false;
        return credit;
    } // end method if student passed course
    
    /**
     * Creates boolean eligibleAP and then reads from a text file, AP.txt, using a Scanner object
     * Checks to see if the course has an AP equivalence
     * @return String that says if there is an available AP course
     * @throws IOException in case the file "AP.txt" does not exist or their is something wrong with it, exceptions must be catched and thrown
     */
    public String iseligibleAP() throws IOException
    {
        boolean eligibleAP = false; // to get if course has an AP equivalent
        Scanner reader = new Scanner( new File( "AP.txt" )); // creates scanner object to read from text file
        String search = "AP " + course;
        while ( reader.hasNext() )
        {
            String word = reader.nextLine(); // reads from text file
            if ( search.equalsIgnoreCase(word)) // if word is found instantiate...
            {
                eligibleAP = true;
            } // end if there is an AP equivalent exam to this course
        } // end while loop to search through the file
        return  "Available AP Course: " + eligibleAP;
    }// end method for eligibleAP course
    
    /**
     * Method to determine grade point earned towards student's course
     * @return double point (grade point earned from the users course)
     */
    public double getGradePoint()
    {
        if (lettergrade.equalsIgnoreCase("A")) point = 4;
        else if (lettergrade.equalsIgnoreCase("B")) point = 3;
        else if (lettergrade.equalsIgnoreCase("C")) point = 2;
        else if (lettergrade.equalsIgnoreCase("D")) point = 1;
        else point = 0;
        return point;
    } // end method return grade point "calculate" grade point earned for course
    
    /**
     * A method that essentially creates a string 
     * Overrides the parent class's, Transcript, method to add if class is an ROP-Regular type course or just Regular
     * @return String that prints out all the information from all the abstract class's method
     */
    public String toString()
    {
        if ( isROP == true ) return "ROP " + super.toString();
        else return "Regular " + super.toString();
    } // end toString() method
} // end subclass Regular
