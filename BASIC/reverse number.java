import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUMBER : ");
        int a=s.nextInt();
        int rev=0;
        int rem=0;
        while(a!=0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("REVERSED NUMBER IS : " +rev);
    }
}


/*
OUTPUT----------
ENTER NUMBER : 
123456789
REVERSED NUMBER IS : 987654321
*/
