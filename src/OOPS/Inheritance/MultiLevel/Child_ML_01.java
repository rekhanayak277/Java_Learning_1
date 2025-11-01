package OOPS.Inheritance.MultiLevel;

public class Child_ML_01 extends Parent_ML_01{

    static int p1 = 50;


    Child_ML_01() {                 // default constructor

    }

    Child_ML_01 (int p4, double p5) {   // 2 parameterised constructor

        System.out.println( "From 2 parameterised Child-1 constructor");
    }

    public static void Child1_Method() {     // static method

        System.out.println("from Child-1 Static Method");

    }


    Child_ML_01(int p2) {               // one parameterized constructor

        this (3,4.9);

        System.out.println("From one parameterised Child-1 constructor");
    }

    int p6 = 50;   // non static variable

    {
        System.out.println(" From Child-1 non static block");

    }

    public void child1MethodNonstatic()
    {
        System.out.println("from child- class  non static method");
    }

    public static void main(String[] args) {

         Child_ML_01 obj1= new Child_ML_01();

         Parent_ML_01 obj = new Child_ML_01();

         obj1. child1MethodNonstatic();

         obj1.ParentMethod_ns();

         obj.ParentMethod_ns();

        System.out.println(Parent_ML_01.p1);

        System.out.println(p1);

        Child_ML_02.parentMethod();

        Parent_ML_01.parentMethod();

        parentMethod();



    }
}






