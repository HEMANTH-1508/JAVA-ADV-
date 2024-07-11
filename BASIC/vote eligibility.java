import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER AGE : ");
        int a=s.nextInt();
        if(a>18)
        {
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
        }
    }
}

/*
OUTPUT---------
ENTER AGE : 
15
YOU ARE NOT ELIGIBLE TO VOTE
*/
