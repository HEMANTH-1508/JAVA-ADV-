public class Arr 
{
    public static void main(String[] args) 
  {
        // ARRAY OUT OF INDEX EXCEPTION
        try 
          {
            int a[] = {1, 2, 3, 4, 5};
            int i;
            for (i = 0; i < 6; i++) {
                System.out.println(a[i]);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
