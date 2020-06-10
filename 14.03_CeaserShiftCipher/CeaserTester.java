import java.util.Scanner;
public class CeaserTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.println("What would you like to do?");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Quit");
            int choice = in.nextInt();
            if(choice == 1) {
                Encryption.Encrypt();
            }   else if(choice == 2)    {
                Decryption.Decrypt();
            }   else if(choice == 3)    {
                System.exit(3);
            }   else    {
                System.out.println("Please select a valid choice.");
            }
        }


    }

}
