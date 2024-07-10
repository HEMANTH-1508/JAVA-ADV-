import java.util.Locale;
import java.util.Scanner;

public class Switchcases
{
    public static void main(String[] arg)
    {
        Scanner x= new Scanner(System.in);
        System.out.println("SELECT ANY ONE CHAR 'B' 'G' 'R' 'Y' : ");
        String a= x.nextLine();
        //char d=x.next().charAt(0);//THIS IS OPTIONAL
        String c= a.toLowerCase();
        switch (c)
        {
            case "b":
                System.out.println("BLUE SELECTED");
                break;
            case "g":
                System.out.println("GREEN 2 SELECTED");
                break;
            case "r":
                System.out.println("RED 3 SELECTED");
                break;
            case "y":
                System.out.println("YELLOW 3 SELECTED");
                break;
            default:
                System.out.println("NUMBER OUT OF RANGE");
        }
    }
}


/*
OUTPUT----
  SELECT ANY ONE CHAR 'B' 'G' 'R' 'Y' : 
  G
  GREEN 2 SELECTED
*/
