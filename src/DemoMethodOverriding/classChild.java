package DemoMethodOverriding;

public class classChild extends classParent {

    public void P_01 () {

        System.out.println("from child method");
    }

    public void P_02 () {

        System.out.println("from child method");
    }

    public static void main(String[] args) {

         classChild obj1 = new classChild();
         obj1.P_01();

        classParent obj3 = new classChild();
        obj3.P_01();

     //   classChild obj4 = new classParent();       // not allowed?
        obj3.P_01();


    }




}
