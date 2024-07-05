package JAVA;

class Overload 
{
    void add(int a, int b)
    {
        a=6;b=7;
        int c=a+b;
        System.out.println("SUM OF TWO NUMBERS IS : "+c);
    }
    void add(int a, int b, int c)
    {
        a=6;b=7;c=5;
        int d=a+b+c;
        System.out.println("SUM OF THREE NUMBERS IS : "+d);
    }


    public static void main(String[] args)
    {
        Overload o1= new Overload();
        o1.add(5, 14);
        o1.add(8, 7, 5);
    }
}


/*
    OUTPUT---
    
     SUM OF TWO NUMBERS IS : 13
    SUM OF THREE NUMBERS IS : 18
 */
