public class ClocksV7 {
    // Declaring private variables
    private String givenName;
    private double time1 = 0.0;
    private double time2 = 0.0;

    // Crating customized constructor
    public ClocksV7(String name, double input1, double input2)  {
        givenName = name;
        time1 = input1;
        time2 = input2;
    }

    // Method to calculate difference (in hours)
    public double difference()  {
        double difference = 0.00;
        if(time1 > time2)   {
            difference = time1-time2;
        }   else    {
            difference = time2-time1;
        }
        return difference;
    }

    // Method to calculate difference in minutes, using an input of hours
    public double difference(double givenDifference)  {
        return givenDifference * 60;
    }


    // Method for table print formatting
    public void printTable(double differenceHrs, double differenceMins)    {
        System.out.printf("%-10s%10.2f%20.2f%20.2f%23.2f\n", givenName, time1, time2, differenceHrs, differenceMins);
    }
}
