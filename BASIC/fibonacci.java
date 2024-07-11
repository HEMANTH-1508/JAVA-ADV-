import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS REQUIRED  : ");
        int n=s.nextInt();
        int fir=0;
        int sec=1;
        int sum;
        int i;
        System.out.print("FIBONNACI SERIES : "+fir+" "+sec);
        for(i=0;i<=n-2;i++)
        {
            sum=fir+sec;
            System.out.print(" "+sum);
            fir=sec;
            sec=sum;
        }
    }
}


/*
OUTPUT-------------
ENTER NUMBER OF ELEMENTS REQUIRED  : 
5
FIBONNACI SERIES : 0 1 1 2 3 5
*/
