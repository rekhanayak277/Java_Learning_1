package OOPS.Inheritance.SingleLevel;

public class Parent_01 {

    Parent_01()
    {
        this(5); //constructor chaining

        System.out.println("from parent constructor");
    }

    int a = 4; //non static

    static int b = 50; //static

    public static void  parentmethodStatic()
    {
        System.out.println("form parent class -  static method");
    }


    Parent_01(int p)
    {
        System.out.println("from parent class - 1 param constructor");

    }

    static
    {
        System.out.println("from parent class -  static block");
    }

    Parent_01( int m , double n) {

        this ();   // constructor chaining

        System.out.println("from parent- class 2 param constructor");
    }

    {
        System.out.println("from parent class - non static block");  // non static block
    }



    public int parentMethodNonStatic(int x)
    {

        System.out.println( x + " value from parent class - non static method");

        return x;
    }

}

