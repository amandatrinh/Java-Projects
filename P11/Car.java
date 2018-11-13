package P11;
/*
 * Amanda Trinh
 * Period 3
 */
public class Car implements CarbonFootprint
{
    public String getCarbonFootprint()
    {
        return "Car CarbonFootprint: 4.7 metric tons of CO2 per year\n" +
                "Identifying Information: \n" +
                "This number can vary based on a vehicle’s fuel, fuel economy, and the number of \n" +
                "miles driven per year. In addition to carbon dioxide (CO2), automobiles produce \n" +
                "methane (CH4) and nitrous oxide (N2O) from the tailpipe and hydrofluorocarbon (HFC)\n" +
                "emissions from leaking air conditioners.\n" +
                "Also Did You Know that diesel creates about 15% more CO2 per gallon.\n";
    } // end method to getCarbonFootprint
} // end class Carbon