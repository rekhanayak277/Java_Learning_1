package LoopPrograms_DecisionStatements;

 // Java program to swap two numbers without using third variable

public class Swap2NumbersWithout3rdVariable {

    public static void main(String[] args) {
        int num1 = 15;
        int num2= 28;

        System.out.println(" original values of a is: " + num1);
        System.out.println(" original values of b is: " + num2);

        // swapping logic without using 3rd variable

        num1 = num1 + num2 ; // now, value of a is 15 + 28 = 43
        num2 = num1 - num2 ; // now, value of b is 43 - 28 = 15
        num1 = num1 - num2 ; // now, value of a is 43

        System.out.println("Now, the value of a is: " + num1);
        System.out.println("Now, the value of a is: " + num2);

    }
}
