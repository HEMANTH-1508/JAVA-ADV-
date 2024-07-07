public class FibonacciSeries 
{
    public static void main(String[] args) 
  {
        int n = 10; // Number of terms in the Fibonacci series
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
        for (int i = 2; i < n; ++i) 
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


/*
OUTPUT-------
  Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
