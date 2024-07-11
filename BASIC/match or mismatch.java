import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER USERNAME: ");
        String str1=s.nextLine();
        System.out.println("REENTER USERNAME: ");
        String str2=s.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("USERNAME MATCHED");
        }
        else
        {
            System.out.println("USERNAME UNMATCHED");
        }
    }
}


/*
OUTPUT-----
ENTER USERNAME: 
hemanth@1508
REENTER USERNAME: 
hemanth@1508
USERNAME MATCHED

*/
