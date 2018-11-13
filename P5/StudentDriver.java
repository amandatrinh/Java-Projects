package P5;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.Scanner;
public class StudentDriver
{
    public static void main( String args[] )
    {
        Scanner reader = new Scanner (System.in);
        Student student = new Student();
        while (true)
        {
            System.out.println("Enter name: ");
            String name = reader.nextLine();      
            student.setName(name);
            System.out.println("Enter your test score: ");
            int score = reader.nextInt();
            student.setScore(score);
            String result = student.getValidateData();
            if (result == null) 
            {
                System.out.println(student);
                break;
            } // end if null
            else 
            {
                System.out.println(result); 
                break;
            } // end else not null
        } // end while, for student's data
    } // end main method
} // end class StudentDriver