package LoopPrograms_DecisionStatements;

 // Java program to swap two numbers without using third variable

public class Swap2NumbersWithout3rdVariable {

    public static void main(String[] args) {
        int a = 15;
        int b= 28;

        System.out.println(" original values of a is: " + a);
        System.out.println(" original values of b is: " + b);

        // swapping logic without using 3rd variable

        a = a + b ; // now, value of a is 15 + 28 = 43
        b = a - b ; // now, value of b is 43 - 28 = 15
        a = a - b ; // now, value of a is 43

        System.out.println("Now, the value of a is: " + a);
        System.out.println("Now, the value of a is: " + b);

    }
}
