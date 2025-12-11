package StringPrograms;

public class TwoOutput_Program2 {

    // Java program to gives two Output: “Subburaj”, “123” for the Input String Str = "Subbu123raj"


    public static void main(String[] args) {

        String input = "Subbu123raj";

        String letters = "";

        String digits = "";

        for ( int i=0 ; i< input.length(); i++ ) {

            char ch1 =  input.charAt(i);

            if (Character.isAlphabetic(ch1)) {

                System.out.println(letters+= ch1);
            }

            else if (Character.isDigit(ch1)) {

                System.out.print(digits+= ch1);

            }


        }
    }
}
