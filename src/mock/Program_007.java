package mock;

public class Program_007 {


    public static void main(String[] args) {
        int x = 1, y=10, z=100;

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

        // i = 0 + 10   - 100 - 98 + 13 - (-1) + 13 - (-2)
        // i =    - 100 - 59 //  -159


        // x = -2
        // y = 12
        // z = 98



        System.out.println("x="+x); // -2
        System.out.println("y="+y); // 12
        System.out.println("z="+z); //98
        System.out.println("i="+i); // -159

    }
}
