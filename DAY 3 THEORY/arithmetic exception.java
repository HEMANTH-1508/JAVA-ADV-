public class Arr 
{
    public static void main(String[] args) 
  {
        // ARITHMETIC EXCEPTION
        try 
          {
            int a, b, c;
            b = 9;
            c = 0;
            a = b / c;
            System.out.println(a);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
