import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int lowerLimit = 0;
        int upperLimit = 0;
        // Entry Trap
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 5; x++)  {
                System.out.println("Please enter a lower limit.");
                String loLim = in.next();
                loLim = loLim.replaceAll("[a-z]", ""); // Removing every letter from the input and replacing with a space.
                if(loLim.equals(""))    { // If only spaces are provided, then error out and ask for another input
                    System.out.println("Your input is invalid, please try again.");
                }   else    { // If a number is given, then assign it to the lower limit.
                    lowerLimit = Integer.parseInt(loLim);
                    x = 6; // Exit the lower limit trap
                }
            }
            for(int x = 0; x < 5; x++)  {
                System.out.println("Please enter an upper limit.");
                String upLim = in.next();
                upLim = upLim.replaceAll("[a-z]", ""); // Same as above
                if(upLim.equals(""))    { // Same as above
                    System.out.println("Your input is invalid, please try again.");
                }   else    {
                    upperLimit = Integer.parseInt(upLim); // Assign number to upperLimit
                    x = 6; // Exit the upper limit loop
                    i = 11; // Exit the entry trap loop
                }
            }
        }
        // End Entry Trap

        PrimeCalculator prime1 = new PrimeCalculator(lowerLimit, upperLimit + 1); // Create object with lower + upper limits
        prime1.primeNum(); // Call the prime finder function using created object

    }
}
