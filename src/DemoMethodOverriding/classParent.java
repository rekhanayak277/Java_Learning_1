package DemoMethodOverriding;

import java.sql.SQLOutput;

public class classParent {

    public void P_01 () {

        System.out.println("from parent method");
    }

    public static void main(String[] args) {

        classParent obj1 = new classParent();
        obj1.P_01();

        classParent obj2 = new classChild();
        obj2.P_01();

        classChild obj3 = new classChild();
        obj3.P_01();

    }
}
