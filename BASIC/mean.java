import java.util.*;

public class mat
{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF NUMBERS : ");
        int a=s.nextInt();
        int i;
        int sum=0;
        for(i=0;i<a;i++)
        {
            int y=i+1;
            System.out.println("ENTER "+y+" NUMBER : ");
            int x=s.nextInt();
            sum+=x;
        }
        int mean=sum/a;
        System.out.println("MEAN OF THE GIVEN NUMBERS IS : "+mean);
    }
}


/*
OUTPUT-------------
ENTER NUMBER OF NUMBERS : 
10
ENTER 1 NUMBER : 
1
ENTER 2 NUMBER : 
2
ENTER 3 NUMBER : 
3
ENTER 4 NUMBER : 
4
ENTER 5 NUMBER : 
5
ENTER 6 NUMBER : 
6
ENTER 7 NUMBER : 
7
ENTER 8 NUMBER : 
8
ENTER 9 NUMBER : 
9
ENTER 10 NUMBER : 
10
MEAN OF THE GIVEN NUMBERS IS : 5
*/
