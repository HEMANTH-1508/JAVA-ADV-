public class ArmstrongNumber 
{
  public static boolean isArmstrong(int number) 
  {
      int originalNumber = number, remainder, result = 0, n = 0;

      // Calculate the number of digits
      while (originalNumber != 0) 
      {
          originalNumber /= 10;
          ++n;
      }

      originalNumber = number;

      // Calculate the sum of the power of digits
      while (originalNumber != 0) 
      {
          remainder = originalNumber % 10;
          result += Math.pow(remainder, n);
          originalNumber /= 10;
      }
     return result == number;
  }

  public static void main(String[] args) 
  {
    int number = 153; // You can change this value to test with other numbers
    if (isArmstrong(number)) 
    {
        System.out.println(number + " is an Armstrong number.");
    } 
    else 
    {
        System.out.println(number + " is not an Armstrong number.");
    }
  }
}


/*
OUTPUT-----------
  153 is an Armstrong number.
*/
