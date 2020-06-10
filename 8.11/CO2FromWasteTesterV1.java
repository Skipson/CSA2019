import java.util.ArrayList;

public class CO2FromWasteTesterV1
{
    public static void main(String[] args)
    {
        ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
        // add households to the ArrayList

        households.add(new CO2FromWasteV1(7, false, false, true, true));
        households.add(new CO2FromWasteV1(6, false, true, true, true));
        households.add(new CO2FromWasteV1(1, true, true, true, true));
        households.add(new CO2FromWasteV1(4, true, true, false, true));
        households.add(new CO2FromWasteV1(3, false, false, false, false));


        for(CO2FromWasteV1 dataRecord : households)
        {
            // invoke methods
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteReduction();
        }

        System.out.println("|       |        |                                         |             Pounds of CO2             |");
        System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
        System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
        System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

        CO2FromWasteV1 dataRecord;

        for(int index = 0; index < households.size(); index ++)
        {
            dataRecord = households.get(index);
            // print each household's data
            System.out.printf("%5d %8d %9b %12b %9b" + " %8b %11.0f %13.1f %13.1f\n",
                    index,
                    dataRecord.getNumPeople(), dataRecord.getPaper(),
                    dataRecord.getPlastic(), dataRecord.getGlass(),
                    dataRecord.getCans(), dataRecord.getEmissions(),
                    dataRecord.getReduction(), dataRecord.getNetEmissions());
        }
    }
}

