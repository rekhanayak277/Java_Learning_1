package LoopPrograms_DecisionStatements;

public class TableOf5_DoWhile {

    public static void main(String[] args) {

        int n = 5;

        do {

            System.out.println(n);

            n = n+=5;
        }

        while (n <= 50);
    }
    }
