package OOPS.Inheritance.SingleLevel;

public class Child_01 extends Parent_01 {


        Child_01()
        {
            this (5, 5.5);//constructor chaining

            System.out.println("From child -class  constructor");
        }

        int m = 9; //from child

        int n = 50; //non static


        Child_01(int a, double v)
        {
            //jvm will define super()

            System.out.println("from child-clSS 2 param constructor");
        }

        static
        {
            System.out.println("from child static block");
        }


        static int s = 50; //static

        {
            System.out.println("from child - class non static block");
        }


        public static void childMethodStatic()

        {
            System.out.println("form child - class static method");
        }

        public void childMethodNonstatic()
        {
            System.out.println("from child- class  non static method");
        }

        public static void main(String[] args) {

            Child_01 obj = new Child_01();

            obj.childMethodNonstatic();

            obj.parentMethodNonStatic(5);

            Parent_01 obj1 = new Child_01();

            obj.childMethodNonstatic();

            obj1. parentMethodNonStatic( 3);


            //static
            childMethodStatic();

            System.out.println( s);


            //static from parent

            System.out.println(b);

            parentmethodStatic();




        }
    }

