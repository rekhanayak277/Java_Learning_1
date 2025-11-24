package StringPrograms;

// Java program to print duplicate characters in a string "Programming"

public class PrintDuplicateCharacters {

    public static void main(String[] args) {

        String givenText = "Programming";

        givenText = givenText.trim();

        for (int i = 0; i < givenText.length(); i++) {
            char ch1= givenText.charAt(i);

            for (int n = i + 1; n < givenText.length(); n++) {
                if (ch1 == givenText.charAt(n)) {
                    System.out.println(ch1);


                }


            }

        }
    }
}