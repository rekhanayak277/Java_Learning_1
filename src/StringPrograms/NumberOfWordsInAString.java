package StringPrograms;

// Java program to count the number of words in a string = "Java is a good programming language"

public class NumberOfWordsInAString {

   public static void main(String[] args) {

        String s = " Java is a good programming language";

        s = s.trim(); // to remove spaces

        String [] s1 = s.split("\\s+");   // to split the sentence

        int count = s1.length;

        System.out.println("Number of words is : " + s1.length);


    }

}






