package P5;

/*
 * Amanda Trinh
 * Period 3
 */
public class Student
{
    private String name;  
    private int test;      
    public Student()
    {
        name = "";
        test = 0;
    } //end Constructor for user's name and test score    
    public void setName( String nm )
    {
        name = nm;
    } // end setName method      
    public String getName()
    {
        return name;
    } // end getName        
    public String getValidateData()
    {
        if (name.equals( "" )) return "SORRY: name required" ;
        else if( test > 100 || test < 0 ) return "SORRY: must have 0 <= test score <= 100";
        else return null;
    } // end validateData   
    public void setScore( int score )
    {
        test = score;
    } // end setTestScore        
    public int getScore()
    {
        return test;
    } // end getScore    
    public String toString()
    {
        String str;
        str = "Name: " + name + "\n" +
              "Test: " + test;
        return str;
    } // end toString() prints answer        
} // end class Student