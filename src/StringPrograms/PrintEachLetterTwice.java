package StringPrograms;

// Java program to print each letter twice from a given string "IamGood"

public class PrintEachLetterTwice {

    public static void main(String[] args) {

        String givenText = "IamGood";

        for (int i=0 ; i < givenText.length(); i++) {

            char ch1 = givenText.charAt(i);

            System.out.println(ch1);

            System.out.println(ch1);


        }
    }
}
