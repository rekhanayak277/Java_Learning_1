package LoopPrograms_DecisionStatements;

public class OddNumbers_DoWhile {

    public static void main(String[] args) {

        int temp=2; //initialization

        do {


            if(temp%2!=0){ //condition

                System.out.println(temp); //statement

            }
            temp+=1; //update
        }

        while (temp<=20); //condition
    }
}
