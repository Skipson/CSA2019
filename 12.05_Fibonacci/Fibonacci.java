public class Fibonacci {
    double givenNum;
    double fibNum;
public Fibonacci(double given)    {
        givenNum = given;
        fibNum = 0;
    }
    public double findFib(double given) {
    if(given == 1 || given == 2)    {
        return 1;
    }   else {
        return findFib(given - 1) + findFib(given - 2);
        }
    }
    // Getters for instance vars
    public double getGiven()  {
        return givenNum;
    }

    public double getFibNum()   {
    return fibNum;
    }

    // Setters for instance vars
    public void setGivenNum(double input)   {
    givenNum = input;
    }

    public void setFibNum(double input)     {
    fibNum = input;
    }

}
