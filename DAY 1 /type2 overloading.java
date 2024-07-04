package JAVA;

class Overload2 
{
    void add(int a, int b)
    {
        a=6;b=7;
        int c=a+b;
        System.out.println("SUM OF TWO NUMBERS IS : "+c);
    }
    void add(double a, double b)
    {
        a=6.5;b=7.2;
        double d=a+b;
        System.out.println("SUM OF TWO NUMBERS IS : "+d);
    }


    public static void main(String[] args)
    {
        Overload2 o1= new Overload2();
        o1.add(5, 14);
        o1.add(4.5,8.2);
    }
}

/*
OUTPUT ---
  
SUM OF TWO NUMBERS IS : 13
SUM OF TWO NUMBERS IS : 13.7
  */
