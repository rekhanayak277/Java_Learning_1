package LoopPrograms_DecisionStatements;

public class OddNumbers_DoWhile {

    public static void main(String[] args) {

        int i=2; //initialization

        do {


            if(i%2!=0){ //condition

                System.out.println(i); //statement

            }
            i+=1; //update
        }

        while (i<=20); //condition
    }
}
