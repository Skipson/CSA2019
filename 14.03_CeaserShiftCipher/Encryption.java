import java.util.Scanner;
public class Encryption {
    public static final String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static int shift;
    public static void Encrypt()    {
        Scanner in = new Scanner(System.in);
        int shiftVal = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Please enter a shift value from 0 to 25");
            String tempVal = in.next();
            tempVal = tempVal.replaceAll("[a-z]", "");
            if (tempVal.equals("")) {
                System.out.println("Your input is not a number. Please try again.");
            } else {
                shiftVal = Integer.parseInt(tempVal);
                if (shiftVal >= 26 || shiftVal < 0) {
                    System.out.println("Your input is a number that is out of range. Please input a number 1-25");
                } else if (shiftVal <= 25) {
                    System.out.println("Input accepted. Processing...");
                    i = 10;
                }
            }
        }
        shift = shiftVal;
        String alphabetString = "";
        String cipherAlphabet = "";
        for(int b = 0; b < alphabet.length; b++)    {
            alphabetString += alphabet[b];
            if((shiftVal + b) >= 26) {
                cipherAlphabet += alphabet[(shiftVal + b) - 26];
            }   else {
                cipherAlphabet += alphabet[b + shiftVal];
            }
        }
        System.out.println("Standard Alphabet: " + alphabetString);
        System.out.println("Encrypted Alphabet: " + cipherAlphabet);
        System.out.println("");
        System.out.println("Please enter a phrase to be encrypted.");
        String inputPhrase = in.next();;
        System.out.println("Given Phrase: " + inputPhrase);
        System.out.println("Encrypted Phrase: " + Encryption.cipherShift(inputPhrase,shiftVal));

    }
    public static String cipherShift(String given, int shiftVal)    {
        String encrypted = "";
        int shiftAmnt = shift;
        for(int i = 0; i < given.length(); i++)   {
            String indexChar = String.valueOf(given.charAt(i));
            for(int a = 0; a < alphabet.length; a++)    {
                if(alphabet[a].compareTo(indexChar) == 0)   {
                    shiftAmnt = a + shiftVal;
                    while((shiftAmnt) >= 26) {
                        shiftAmnt = shiftAmnt - 26;
                    }
                    encrypted += alphabet[shiftAmnt];
                }
            }
        }
        return encrypted;
    }
}


