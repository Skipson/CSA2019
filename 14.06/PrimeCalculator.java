import java.util.ArrayList;
public class PrimeCalculator {
    // Private instance vars
    private int low;
    private int high;
    private boolean isPrime;
    private int counter;
    // Constructor including lower + upper limit
    public PrimeCalculator(int low, int high)   {
        this.low = low;
        this.high = high;
    }

    public void primeNum() {
        int num = low;
        ArrayList<Integer> primes = new ArrayList<Integer>(); //ArrayList that will hold all found primes.
        // Loop to determine if number is prime or not
        for(int n = num; num < high; num++) {
            if(num == 2)    { // If the number is 2, then it is prime.
                isPrime = true;
            }   else if(num == 1)   { // If the number is 1, then it is not prime.
                isPrime = false;
            }   else {
                for (int i = 2; i < high; i++) { // Count every number between 2 and the upper limit provided.
                    if (i != num) { // If the number being divided equals the number given, then ignore the rest.
                        if (num % i == 0) { // Is the given number able to be divided evenly by any number apart from itself
                            isPrime = false; // If so, then it is not prime
                            break; // Exit the loop, since it is already determined that the number is non prime.
                        } else {
                            isPrime = true; // If it can't be divided by any number between the lower and upper limit that is not itself, it must be prime.
                        }
                    }
                }
            }
            if(isPrime) { // If prime status is true, then add the number to the ArrayList and increment the counter.
                primes.add(num);
                counter++;
            }
        }
        // Printing prime number results.
        System.out.print("Prime Numbers: ");
        for(int i = 0; i < primes.size(); i++)  { // Scaling the ArrayList
            System.out.print(primes.get(i) + ", ");
        }
        System.out.println("\n Prime Number Counter: " +getCounter());
    }


    // Getters + Setters

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
