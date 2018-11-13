/*
 * Amanda Trinh
 * Period 3
 */
public class AP extends Transcript implements CalculateGPA
{
    int apscore; // to get AP exam score
    
    /**
     * Constructor class that initializes the variables course, lettergrade, apscore
     * @param name of course (c), String course
     * @param grade (letter) received for course, String lettergrade
     * @param user's score received on AP exam, int apscore
     */
    public AP( String c, String letter, int score )
    {
        course = c;
        lettergrade = letter;
        apscore = score;
    } // end constructor method
    
    /**
     * Identifies AP objects courses as weighted courses
     * @return boolean isWeighted, true
     */
    public boolean setisWeighted() 
    {
        isWeighted = true;
        return isWeighted;
    } // method tells if course is weighted
    
    /**
     * According to String lettergrade, checks if user passed the course or not.
     * @return boolean credit, if user passed course or not
     */
    public boolean passClass()
    {
        if (lettergrade == "D" ||lettergrade == "C" || lettergrade == "B" || lettergrade == "A" ) credit = true;
        else credit = false;
        return credit;
    } // end method if student passed course
    
    /**
     * Method to determine grade point earned towards student's course
     * @return double point (grade point earned from the users course)
     */
    public double getGradePoint()
    {
        if (lettergrade.equalsIgnoreCase("A")) point = 5;
        else if (lettergrade.equalsIgnoreCase("B")) point = 4;
        else if (lettergrade.equalsIgnoreCase("C")) point = 3;
        else if (lettergrade.equalsIgnoreCase("D")) point = 2;
        else if (lettergrade.equalsIgnoreCase("F")) point = 1;
        else point = 0;
        return point;
    } // end method return grade point "calculate" grade point earned for course
    
    /**
     * Method that uses int apscore to determine whether or not user passed AP exam
     * @return boolean true if user passed exam or false if not (or score does not exist)
     */
    public boolean passAP()
    {
        if ( apscore >= 3 && apscore <= 5 ) return true;
        else return false;
    } // end whether or not student passed AP exam method
    
    /**
     * A method that essentially creates a string 
     * Overrides the parent class's, Transcript, method to add that the class is an AP type course and how it's weighted
     * and adds int apscore and passAP() method when returned
     * @return String that prints out all the information from all the abstract class's method
     */
    public String toString()
    {
        return "AP " + super.toString() + " (1.0 point added)\n" +
               "AP Score (0-5): " + apscore + "\n" +
               "Pass AP Exam: " + passAP();
    } // end toString() method
} // end subclass AP