package IncrementDecrementOperator;

public class IncrementDecrementProgram_01 {

    public static void main(String[] args) {

        int i=19, j=29, k;

        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

        //k = 19   - 18  + 28  - 29  + 18  - 29  + 19 - 28
//

        System.out.println("i="+i); //19
        System.out.println("j="+j); //29
        System.out.println("k="+k); //-20

    }
}
