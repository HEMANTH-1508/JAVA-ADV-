public class NumberFormatExceptionExample 
{
    public static void main(String[] args) 
  {
        try 
        {
            String str = "abc";
            int num = Integer.parseInt(str);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }
}
