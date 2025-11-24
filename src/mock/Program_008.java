package mock;

public class Program_008 {

    // reverse the num
    /*
    num>0
    {lastnum
    rev =rev*10+ last
    }
    rev
     */

    public static void main(String[] args) {

        int num = 678361;

       int reverse = 0 ;

       //logic to find rev num
      for (int n=num ; n>0 ;num = num / 10) {

          int lastDigit = num % 10; //5678 ->8
          reverse = reverse * 10 + lastDigit;

      }

        System.out.println(reverse);
      }

    }

