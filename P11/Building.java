package P11;
/*
 * Amanda Trinh
 * Period 3
 */
public class Building implements CarbonFootprint
{
    public String getCarbonFootprint()
    {
        return "Building CarbonFootprint: 38% of all U.S. Carbon Emissions\n" +
                "Some Identifying Information: \n" + 
                "Nearly all of the greenhouse gas (GHG) emissions from the residential and \n" + 
                "commercial sectors can be attributed to energy use in buildings. \n" + 
                "Space heating, cooling, air conditioning, and lighting are all exmaples \n" +
                "of activities that raise carbon emissions in buildings. \n";
    } // end method to getCarbonFootprint
} // end class Building
