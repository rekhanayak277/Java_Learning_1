package Operators.IncrementDecrementOperator;

public class Program_03 {
   // int m=1010, n=1010;
       // System.out.println(m++ / ++n * n-- / --m);

    public static void main(String[] args) {
        int m = 1010 , n=1010;

        int k = m++ / ++n * n-- / --m ;

        // k = (1010 / 1009) * (1009 / 1010) = 0

        System.out.println(k);
        System.out.println(m);
        System.out.println(n);
    }

}

 //m =1010       n=1010

// k is 0