package DemoMethodOverloading;

public class MethodOverloadingProgram_1 {
    /*
    Write a method sum(int a, int b) that returns the sum of two integers.
    Overload it with sum(double a, double b) to return the sum of two doubles.
    Overload again with sum(int a, int b, int c) to return the sum of three integers
    */


    public static void sum (int a , int b)
        {
            System.out.println(a+b);
        }

    private static void sum (double a , double b)
    {
        System.out.println(a+b);
    }

    protected static void sum (int a , int b, int c)
    {
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        sum (5, 6);
        sum(5.0, 6.0);
        sum(2,4, 5 );
    }

    }


