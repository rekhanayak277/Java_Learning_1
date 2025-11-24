package LoopPrograms_DecisionStatements.LoopPrograms;

public class ArmstrongNumberCheck_DoWhileLoop {

    public static void main(String[] args) {

        int originalNumber = 371;

        int sum = 0;

        int num = originalNumber;

        do {

            int i = num % 10;

            sum = sum + (i * i * i);

            num = num / 10;

        }

        while (num >= 1);

        if (originalNumber == sum) {

            System.out.println(originalNumber + " is an armstrong number");

        } else {

            System.out.println(originalNumber + " is not an armstrong number");
        }

    }
}









