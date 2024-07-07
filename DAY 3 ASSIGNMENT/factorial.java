public class Factorial
{
  public  int factorial(int n) 
  {
      int result = 1;
      for (int i = 1; i <= n; i++) 
      {
          result *= i;
      }
      return result;
  }
  public static void main(String[] args) 
  {
        int number = 5;
        System.out.println("Factorial of " + number + " : " + factorial(number));
  }
}

/*
OUTPUT------
  120
  */
