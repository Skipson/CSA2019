import java.util.ArrayList;
import java.util.Scanner;
public class V9Tester {
    public static void main(String[] args) {
        // Declaring Scanner
        Scanner in = new Scanner(System.in);

        // Asking user for object count
        System.out.println("How many people do you have? (10 people is recommended)");
        int objCount = in.nextInt();
        // Creating ArrayList with amount of objects
        ArrayList<ClocksV9> allTimes = new ArrayList<ClocksV9>();

        // Prompting the user for input
        for (int i = 0; i < objCount; i++) {
            System.out.println("Person # " + (i + 1));
            System.out.println("What is your first name?");
            String name = in.next();
            System.out.println("Hello " + name);
            System.out.println("Please enter your first time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
            double firstTime = in.nextDouble();
            System.out.println("Please enter your second time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
            double secondTime = in.nextDouble();
            allTimes.add(new ClocksV9(name, firstTime, secondTime));             // Assigning inputs to an object
        }

        // Creating an array of standard numbers for the max, min, and avg methods
        double[] timesForAvg = new double[objCount];
        // Creating dataRecord for extraction of data from ArrayList
        ClocksV9 dataRecord;
        // Printing table header
        System.out.printf("%50s\n", "Time Trial Calculations");
        System.out.printf("%-10s%10s%20s%25s%20s\n", "Name", "Time 1 (hrs)", "Time 2 (hrs)", "Difference (Hrs)", "Difference (Mins)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        // Printing respective attributes of objects
        for (int i = 0; i < objCount; i++) {
            dataRecord = allTimes.get(i);
            double temp = dataRecord.difference();
            timesForAvg[i] = temp;
            dataRecord.printTable(dataRecord.difference(), dataRecord.difference(dataRecord.difference()));
        }

        // temp object used to access methods (workaround)
        ClocksV9 temp = new ClocksV9("none", 0, 0);
        // Printing averages and max / min
        System.out.printf("%50s%15.2f%25.2f\n%50s%15.2f%25.2f\n%50s%15.2f%25.2f",
                "Minimum: ", temp.diffMinimum(timesForAvg), temp.hrToMin(temp.diffMinimum(timesForAvg)),
                "Maximum: ", temp.diffMaximum(timesForAvg), temp.hrToMin(temp.diffMaximum(timesForAvg)),
                "Average: ", temp.avgDifference(timesForAvg), temp.hrToMin(temp.avgDifference(timesForAvg)));
        System.out.println("\n--------------------------------------------------------------------------------------------");
    }
}