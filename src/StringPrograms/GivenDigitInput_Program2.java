package StringPrograms;

public class GivenDigitInput_Program2 {

    // Java program to gives Output: “32412120000” for the Input String Str = “32400121200”


    public static void main(String[] args) {

        String input = "32400121200";

        String digits = "";

        String zeros = "";

        for ( int a =0 ; a < input.length() ; a++) {

            char ch = input.charAt(a);

            if (ch == 0) {

                zeros += ch;

            } else {

                digits += ch;
            }

        }

         String result = digits + zeros;

            System.out.println(result);


    }
}
