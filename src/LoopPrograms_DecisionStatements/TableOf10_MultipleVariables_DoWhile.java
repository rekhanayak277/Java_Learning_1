package LoopPrograms_DecisionStatements;

public class TableOf10_MultipleVariables_DoWhile {

    public static void main(String[] args) {

        int n = 10; //initialization (constant)
        int j = 1; //initialization (for increment)


        do {

            int k = n * j; //for product )

            System.out.println(n + "*" + j + "=" + k); //print statement

            j++; //update

        }


        while (j<=10); //condition
    }
}
