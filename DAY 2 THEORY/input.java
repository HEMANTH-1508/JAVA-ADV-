import java.util.Scanner;

public class Example
{
    public static void main(String arg[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("ENTER 2 NUMBERS  : ");
        int s1=x.nextInt();
        int s2=x.nextInt();
        int c=s1+s2;
        System.out.println("SUM OF TWO NUMBER IS : "+c);
    }
}

/*
OUTPUT--------
  ENTER 2 NUMBERS  : 
25
84
SUM OF TWO NUMBER IS : 109
  */
