package mock;

public class Program_002 {
    static int increment(int x) {

        return ++x;

    }

    public static void main(String[] args) {

        int a = 5;

        a = increment(a++) + increment(++a);     // post increment - use 5 and then a = 6
         // increment(5)   + increment(7)        //pre increment - increase to 7 and then use
         // 6 + 8

        System.out.println(a); // should be 14

    }

}
