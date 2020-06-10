public class ClocksV8 {
    // Declaring private variables
    private String givenName;
    private double time1 = 0.0;
    private double time2 = 0.0;
    private double objDifference;

    // Crating customized constructor
    public ClocksV8(String name, double input1, double input2)  {
        givenName = name;
        time1 = input1;
        time2 = input2;
        objDifference = 0.0;
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

    // Method to find minimum difference value (HOURS)
    public double diffMinimum(ClocksV8[] given)   {
        double minVal = Double.MAX_VALUE;
        for(int i = 0; i < given.length; i++)   {
            double diff = given[i].difference();
            if( diff < minVal)  {
                minVal = diff;
            }
        }
        return minVal;
    }

    // Method to find maximum difference value (HOURS)
    public double diffMaximum(ClocksV8[] given)   {
        double maxVal = Double.MIN_VALUE;
        for(int i = 0; i < given.length; i++)   {
            double diff = given[i].difference();
            if (diff > maxVal)  {
                maxVal = diff;
            }
        }
        return maxVal;
    }

    // Method to find average difference between max and min value in hours
    public double avgDifference(ClocksV8[] given) {
        double total = 0.0;
        for(int i = 0; i < given.length; i++)   {
            double diff  = given[i].difference();
            total += diff;
        }
        return total/given.length;
    }


    // Method to change any time from hours to minutes
    public double hrToMin(double input) { return input * 60; }

    // Getter for name
    public String getName()   {
        return givenName;
    }

    // Getter for time1
    public double getTime1()  {
        return time1;
    }

    // Getter for time2
    public double getTime2()  {
        return time1;
    }

    // Getter for the time difference
    public double getObjDifference()  {
        return objDifference;
    }

    // Setter for name
    public void setName(String name)    {
        givenName = name;
    }

    // Setter for time1
    public void setTime1(double time)   {
        time1 = time;
    }

    // Setter for time2
    public void setTime2(double time)   {
        time2 = time;
    }

    // setter for time difference
    public void setObjDifference(double difference) {
        objDifference = difference;
    }


    // toString function
    public String toString()
    {
        return String.format("%12s %9f %14.1f %13.1f %13.1f", givenName, time1, time2, objDifference, objDifference * 60);
    }
}
