public class Example
{
    public static void main(String arg[])
    {
        String s="Whatever it may be, just do it as said by the higher authority......";
        //String t="You cant do whatever you like to do in the class without any acknowledgement..";
        String a=s.replaceAll("a","@");
        System.out.println(a);

    }
}

/*
OUTPUT----------
  Wh@tever it m@y be, just do it @s s@id by the higher @uthority......
*/
