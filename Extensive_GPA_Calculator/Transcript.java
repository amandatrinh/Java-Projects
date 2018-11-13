/*
 * Amanda Trinh
 * Period 3
 */
public abstract class Transcript
{
    protected String course; // the course a student took
    protected String lettergrade; // Letter grade that the student got in that course
    protected boolean isWeighted; // check is course is weighted so student can see in GPA later
    protected boolean credit; // variable for passClass()
    protected double point; // to set grade point
    
    /**
     * @return String course
     */
    public String getCourse()
    {
        return course;
    } // end method getCourse()
    
    /**
     * According to type of subclass:
     * @return boolean isWeighted, if course is a weighted class or not
     */
    public abstract boolean setisWeighted(); // method tells if course is weighted
    
    /**
     * According to String lettergrade, checks if user passed the course or not.
     * @return boolean credit, if user passed course or not
     */
    public abstract boolean passClass(); // uses lettergrade to see if pass course
    
    /**
     * A method that essentially creates a string
     * @return String that prints out all the information from all this class's methods
     */
    public String toString()
    {
        return "Course: " + course + "\n" +
               "Grade: " + lettergrade + "\n" +
               "Credit Earned: " + passClass() + "\n" +
               "Weighted Course: " + setisWeighted();
    } // end toString() method
} // end abstract class Transcript
