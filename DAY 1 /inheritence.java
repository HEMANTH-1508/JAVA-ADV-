package JAVA;

class Inheritence 
{
    void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("SUM OF TWO NUMBERS IS (int) : " + c);
    }
    
    void add(double a, double b) 
    {
        double d = a + b;
        System.out.println("SUM OF TWO NUMBERS IS (double) : " + d);
    }
}

class Subclass extends Inheritence 
{
    void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("Overridden method: SUM OF TWO NUMBERS IS (int) : " + c);
    }
}

public class inheritence 
{
    public static void main(String[] args) 
    {
        Inheritence o1 = new Inheritence();
        Subclass o2 = new Subclass();
        
        o1.add(5, 14);
        o1.add(4.5, 8.2);
        
        o2.add(6, 7);
        o2.add(6.5, 7.2);
    }
}

/*
    OUTPUT---
    SUM OF TWO NUMBERS IS (int) : 19
    SUM OF TWO NUMBERS IS (double) : 12.7
    Overridden method: SUM OF TWO NUMBERS IS (int) : 13
    SUM OF TWO NUMBERS IS (double) : 13.7
 */
