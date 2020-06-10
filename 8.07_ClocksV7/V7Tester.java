import java.util.Scanner;
public class V7Tester {
    public static void main(String[] args)  {
        // Declaring Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first name?");

        // Getting info for first object
        String name = in.next();
        System.out.println("Hello " + name);
        System.out.println("Please enter your first time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double firstTime = in.nextDouble();
        System.out.println("Please enter your second time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double secondTime = in.nextDouble();
        // Creating first object
        ClocksV7 timeset1 = new ClocksV7(name, firstTime, secondTime);

        // Getting info for second object
        System.out.println("What is the name of the second person?");
        String name2 = in.next();
        System.out.println("Hello " + name2);
        System.out.println("Please enter your first time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double firstTime2 = in.nextDouble();
        System.out.println("Please enter your second time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double secondTime2 = in.nextDouble();
        // Creating second object
        ClocksV7 timeset2 = new ClocksV7(name2, firstTime2, secondTime2);

        // Getting info for third object
        System.out.println("What is the name of the third person?");
        String name3 = in.next();
        System.out.println("Hello " + name3);
        System.out.println("Please enter your first time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double firstTime3 = in.nextDouble();
        System.out.println("Please enter your second time. (In hours, e.g. 2.50 for 2 hours and 30 minutes)");
        double secondTime3 = in.nextDouble();
        // Creating third object
        ClocksV7 timeset3 = new ClocksV7(name3, firstTime3, secondTime3);

        // Printing results
        System.out.printf("%50s\n", "Time Trial Calculations");
        System.out.printf("%-10s%10s%20s%25s%20s\n","Name", "Time 1 (hrs)", "Time 2 (hrs)", "Difference (Hrs)", "Difference (Mins)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        // Printing info for first object
        timeset1.printTable(timeset1.difference(), timeset1.difference(timeset1.difference()));
        // Printing info for second object
        timeset2.printTable(timeset2.difference(), timeset2.difference(timeset2.difference()));
        // Printing info for third object
        timeset3.printTable(timeset3.difference(), timeset3.difference(timeset3.difference()));
    }
}
