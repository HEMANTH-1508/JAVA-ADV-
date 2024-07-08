public class DilshadNumber 
{

    public static boolean isDilshadNumber(int num) 
    {
        String numStr = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) 
        {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1); // digit raised to the power of its position (1-based index)
        }

        return sum == num;
    }

    public static void main(String[] args) 
    {
        int number = 89; // Example number
        if (isDilshadNumber(number)) 
        {
            System.out.println(number + " is a Dilshad number.");
        } 
        else 
        {
            System.out.println(number + " is not a Dilshad number.");
        }
    }
}