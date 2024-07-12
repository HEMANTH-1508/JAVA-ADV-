import java.util.*;

public class mat
{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER LAST NUMBER  : ");
        int a=s.nextInt();
        int i=0;
        int sum=0;
        for(i=0;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println("SUM OF FIRST N DIGITS IS : "+sum);
    }
}


/*
OUTPUT------
ENTER LAST NUMBER  : 
10
SUM OF FIRST N DIGITS IS : 55
*/
