package LoopPrograms_DecisionStatements;

public class TableOf10_MultipleVariables_DoWhile {

    public static void main(String[] args) {

        int first = 10; //initialization (constant)
        int second = 1; //initialization (for increment)


        do {

            int result = first * second; //for product )

            System.out.println(first + "*" + second + "=" + result); //print statement

            second++; //update

        }


        while (second<=10); //condition
    }
}
