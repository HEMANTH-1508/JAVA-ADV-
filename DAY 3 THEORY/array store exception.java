public class ArrayStoreExceptionExample 
{
    public static void main(String[] args) 
  {
        try 
        {
            Object[] arr = new Integer[3];
            arr[0] = "string"; // Trying to store a string in an Integer array
        } 
        catch (ArrayStoreException e) 
        {
            System.out.println("Caught ArrayStoreException: " + e);
        }
    }
}
