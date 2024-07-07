public class IndexOutOfBoundsExceptionExample 
{
    public static void main(String[] args) 
  {
        try 
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Accessing index 5 which does not exist
        } 
        catch (IndexOutOfBoundsException e) 
        {
            System.out.println("Caught IndexOutOfBoundsException: " + e);
        }
    }
}
