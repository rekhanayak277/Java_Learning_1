package ClassOverloading;

public  class COL_Program1 {

    static
    {

        System.out.println("This is a static block");
    }
     static int i = 100;

    COL_Program1() {

        this(99.99);

        this.m1();

        System.out.println("This is a default constructor");

        this.m2();
    }

    {

        System.out.println("This is a non static block");
    }


    public static void m1() {

            System.out.println("This is static method");
    }

    double d = 99.99;

     void m2(){
        System.out.println("This is a non-static method");
    }

     COL_Program1(int i) {
         System.out.println("This is a parameterized constructor with argument type int");
     }

     COL_Program1(double d) {

      System.out.println("This is a parameterized constructor with argument type double");
        }

         public static void main(String[] args) {

         COL_Program1 obj1 = new COL_Program1();

         COL_Program1 obj2 = new COL_Program1(100.10);
         obj2.m2();

         COL_Program1 obj3 = new COL_Program1( 200);

         obj3.m1();

             System.out.println(i);
             System.out.println(obj2.d);

             m1();



    }



}
