package StringPrograms;

public class GivenDigitInput_Program1 {
    // Java program to gives Output: “00003241212” for the Input String Str = “32400121200”


    public static void main(String[] args) {

        String input = "32400121200";

        String zeros = "";
        String digits = "";


        for (int i = 0 ; i < input.length() ; i++) {

            char ch = input.charAt(i);

            if (ch == '0') {

                zeros += ch;

            } else {

                digits += ch;
            }
        }

            String result = zeros+digits;

            System.out.println(result);


    }

}
