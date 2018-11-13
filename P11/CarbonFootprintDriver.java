package P11;
public class CarbonFootprintDriver
{
    public static void main( String args[] )
    {
        /* instantiate the 3 CarbonFootprint objects */
        Building b0 = new Building();
        Car c0 = new Car();
        Bicycle bike0 = new Bicycle();
        
        /* Puts the objects into an array */
        CarbonFootprint [] array = {c0, b0, bike0};
        
        /* Prints out the three objects */
        System.out.println( "Carbon Footprints of the Average Building, Car, and Bicycle\n\n" );
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( array[i].getCarbonFootprint() );
        } // end for loop
        
        System.out.println( "\nYou can always reduce your carbon emissions level by: " +
                            "*Walking or Riding a back for transportation P.S. It's a nice workout!\n" +
                            "*Electric cars don't burn fossil fuels, so they are another great alternative\n" +
                            "*Insulating and sealing your home\n" +
                            "*Using energy-efficient apliances and light-bulbs\n" +
                            "*SOLAR POWER\n" +
                            "*Reduce, Reuse, and Recycle --- THREE R's!\n" +
                            "*Being water-efficient can help reduce the need to heat it in the first place.\n" );
    } // end main method
} // end class CarbonFootprintDriver