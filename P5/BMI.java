package P5;
/*
 * Amanda Trinh
 * Period 3
 */
public class BMI
{
    private double weight, height, BMI;
    private String type;    
    public BMI()
    {
        weight = 0;
        height = 0;
    
    } // end constructor for weight and height   
    public BMI( double inputWeight, double inputHeight )
    {
        weight = inputWeight;
        height = inputHeight;
        
    } // end input user's weight & height     
    public void setBMI( double BMI)
    {
        if (BMI <= 18.49) type="underweight";
        if (BMI >= 18.49 && BMI <= 24.9) type="normal";
        if (BMI >= 25 && BMI <= 29.9) type="overweight";
        if (BMI >= 30) type="obese";        
    } // set BMI type for user    
    public double getBMI()
    {
        return BMI;
        
    } // return BMI condition
    public String toString()
    {
        String str;
        str = "Weight: " + weight + "\n" +
              "Height: " + height + "\n" + 
              "You are " + type + "\n" +
              "BMI: Body Mass Index Values: \n" + 
              "Underweight: BMI < 18.49 \n" +
              "Normal: 18.5 < BMI < 24.9 \n" +
              "Overweight: 25 < BMI < 29.9 \n" +
              "Obese: BMI > 30 " + "\n";
        return str;
    } // end toString
} // end class BMI