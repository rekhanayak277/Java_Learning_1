package LoopPrograms_DecisionStatements;

public class TableOf3_multiplevariables_For {
/*
        Table of 3
            Logic here:
        Print - 3 6 9 12 15 18 21 24 27 30
        Use 2 variables,
        n1-constant, n2-increment by 1,

        Doubt -
       Why code works with (n1*n2) added in print statement
       Why does not work, when n3 is declared as (n1*n2) and in print statement, added as n3

*/
        public static void main(String[] args) {

            final int num1 =3;

            for (int num2 =1;  num2<=10 ; num2++)

            {
                int result=num1*num2;

                System.out.println(num1+ "*" +num2+"=" +result);
            }
        }

}







