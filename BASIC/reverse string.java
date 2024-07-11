import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String rev="";
        System.out.println("ENTER A STRING : ");
        String str=s.nextLine();
        int i;
        int j=str.length();
        for(i=j-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}


/*
OUTPUT------
hello
olleh
/*
