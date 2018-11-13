package P5;
/*
 * Amanda Trinh
 * Period 3
 */
import java.util.*;
public class HeartRates
{
    private String firstname, lastname;
    private int birthmonth, birthday, birthyear, maxrate;
    private double targetrate50, targetrate85;
    private int currentMonth, currentDay, currentYear;
    private int age;
    public HeartRates()
    {
        firstname = "";
        lastname = "";
        birthmonth = 0;
        birthday = 0;
        birthyear = 0;
    } // end HeartRates constructor
    public Date createDate()
    {
        GregorianCalendar date = new GregorianCalendar();
        currentMonth = 1 + date.get(Calendar.MONTH);
        currentDay = date.get(Calendar.DAY_OF_MONTH);
        currentYear = date.get(Calendar.YEAR);
        return date.getTime();            
    } // end method for current createDate and Time
    public HeartRates( String inputFirstname, String inputLastname, int inputBirthmonth, int inputBirthday, int inputBirthyear )
    {
        createDate();
        firstname = inputFirstname;
        lastname = inputLastname;
        birthmonth = inputBirthmonth;
        birthday = inputBirthday;
        birthyear = inputBirthyear;
        if ( birthmonth < currentMonth ) age = currentYear-birthyear;
        else if ( birthmonth > currentMonth ) age = currentYear-birthyear-1;
        else if ( birthday <= currentDay ) age = currentYear-birthyear;
        else age = (currentYear-birthyear-1);
        // calculates user's age
        maxrate = 220 - age;
        targetrate50 = maxrate*(.5);
        targetrate85 = maxrate*(.85);
    } // end retrieve User's input data
    public String toString()
    {
        String str;
        str = "Full Name: " + firstname + " " + lastname + "\n" +
              "Birthday is: " + birthmonth + "/" + birthday + "/" + birthyear + "\n" +
              "It is now: " + createDate() + "\n\n" +
              "You are " + age + " years old." + "\n" + 
              "Max Heart Rate is: " + maxrate + " BPM \n" + 
              "Your target Heart Rate is: " + targetrate50 + " < BPM < " + targetrate85;       
        return str;
    } // end return HeartRates toString()
} // end class HeartRates
