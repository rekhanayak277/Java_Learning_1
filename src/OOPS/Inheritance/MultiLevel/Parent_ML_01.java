package OOPS.Inheritance.MultiLevel;

public class Parent_ML_01 {

    static int p1 = 40;

    Parent_ML_01 () {                 // default constructor

    }

    Parent_ML_01 (int p4, double p5) {   // 2 parameterised constructor

        System.out.println( "From 2 parameterised Parent constructor");

        System.out.println(p4);

        System.out.println(p5);
    }

    public static void parentMethod() {     // static method

        System.out.println("from Parent Static Method");

    }

    static {                               // static block

        System.out.println( " From Parent static block");
    }

    Parent_ML_01(int p2) {               // one parameterized constructor

        this (3,4.9);

        System.out.println("From one parameterised Parent constructor");
    }

    int p6 = 50;   // non static variable

    {
        System.out.println(" From parent non static block");

    }

  public void ParentMethod_ns (){

      System.out.println("From Nonstatic Parent method");
  }

}
