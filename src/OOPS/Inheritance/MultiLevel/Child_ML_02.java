package OOPS.Inheritance.MultiLevel;

public class Child_ML_02  extends Child_ML_01{


    static {                      // static block

        System.out.println( " From Child-2 static block");
    }

    public void Child2Method (){

        System.out.println("From Nonstatic Child-2 method");
    }


    static int p1 = 60;


    Child_ML_02() {                 // default constructor

    }

    Child_ML_02 (int p4, int p5) {   // 2 parameterized constructor

        System.out.println( "From 2 parameterised Child-2 constructor");
    }

    public static void child2_Method() {     // static method

        System.out.println("from Child-2 Static Method");

    }


    Child_ML_02(int p2) {               // one parameterized constructor

        this (3,9);

        System.out.println("From one parameterised Child-2 constructor");
    }

    int p6 = 50;   // non static variable

    {
        System.out.println(" From Child-2 non static block");

    }

    public void child1MethodNonstatic()
    {
        System.out.println("from child- class  non static method");
    }

    public static void main(String[] args) {

        Child_ML_01 obj1= new Child_ML_01();

        Parent_ML_01 obj = new Child_ML_01();

        Child_ML_02 obj2 = new Child_ML_02();

        Parent_ML_01 obj3 = new Child_ML_02();

        Child_ML_01 obj4 = new Child_ML_02();

        obj1. child1MethodNonstatic();

        obj1.ParentMethod_ns (); ;

        obj.ParentMethod_ns();

        obj2.child1MethodNonstatic();

        obj3.ParentMethod_ns();

        Child_ML_02.parentMethod();

        Child_ML_01.parentMethod();

        obj4.ParentMethod_ns ();

        Parent_ML_01.parentMethod();

        System.out.println(Parent_ML_01.p1);

        System.out.println(p1);

    }
}



