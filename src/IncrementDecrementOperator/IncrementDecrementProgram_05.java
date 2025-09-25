package IncrementDecrementOperator;

public class IncrementDecrementProgram_05 {
    //int i=0;
    // i = i++ - --i + ++i - i--;
    // System.out.println(i);

    public static void main(String[] args) {

        int i = 10 ;  //11 -- 10 -- 11 -- 10 =

          i = i++ - --i + ++i - i--;

        // i = 10 - 10  + 11  - 11 = 0

        System.out.println(i);
    }
}
