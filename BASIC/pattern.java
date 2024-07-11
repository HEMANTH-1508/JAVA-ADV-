import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}

/*
OUTPUT------------
ENTER A NUMBER : 
5
11111 
2222 
333 
44 
5 

  */
