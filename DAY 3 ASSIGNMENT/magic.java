public class MagicNumber 
{
    public static boolean isMagic(int number) 
  {
        while (number > 9) 
        {
            number = sumOfDigitsSquares(number);
        }
        return number == 1;
    }

    private static int sumOfDigitsSquares(int number) 
  {
        int sum = 0;
        while (number != 0) 
        {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

   public static void main(String[] args) 
  {
        int number = 19; // You can change this value to test with other numbers
        if (isMagic(number)) 
        {
            System.out.println(number + " is a magic number.");
        } 
        else 
        {
            System.out.println(number + " is not a magic number.");
        }
    }
}


/*
OUTPUT---
  19 is a magic number.
*/
