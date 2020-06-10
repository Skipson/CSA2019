import java.util.Scanner;
public class FibonacciTester {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        String inputCheck = "";
        double temp = 0;
        int input = 0;
        double fibNum = 0;
        System.out.println("This program will take in a number and return the Fibonacci number.");
        for(int i = 1; i > 0; i++)    {
            System.out.println("Please input a WHOLE number, or type 'q' to quit: ");
            inputCheck = in.next();
            if(inputCheck.equals("q"))  {
                System.out.println("Thankyou for using the program.");
                System.exit(1);
            }   else    {
                temp = Double.parseDouble(inputCheck);
                input = (int) (temp);
            }
            Fibonacci fibonacci = new Fibonacci(input);
            fibNum = fibonacci.findFib(input);
            System.out.println(fibNum);
        }
    }
}
