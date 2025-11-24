package LoopPrograms_DecisionStatements;

public class TableOf5_DoWhile {

    public static void main(String[] args) {

        int num = 5;

        do {

            System.out.println(num);

            num = num+=5;
        }

        while (num <= 50);
    }
    }
