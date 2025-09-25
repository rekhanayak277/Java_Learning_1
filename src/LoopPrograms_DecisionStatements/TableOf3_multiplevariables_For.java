package LoopPrograms_DecisionStatements;

public class TableOf3_multiplevariables_For {
/*
        Table of 3
            Logic here:
        Print - 3 6 9 12 15 18 21 24 27 30
        Use 2 variables,
        n1-constant, n2-increment by 1,

        Doubt -
       Why code works with (n1+n2) added in print statement
       Why does not work, when n3 is declared as (n1+n2) and in print statement, added as n3

*/
        public static void main(String[] args) {

            int n1 =3;

            for (int n2 =1;  n2<=10 ; n2++)

            {
                int n3=n1*n2;

                System.out.println(n1+ "*" +n2+"=" +n3);
            }
        }

}







