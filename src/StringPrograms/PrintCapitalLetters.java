package StringPrograms;

// Java program to print only capital letter in a given string "JavaIsaprogRamMinGlangUage"

public class PrintCapitalLetters {

    public static void main(String[] args) {

        String text = "JavaIsaprogRamMinGlangUage";

        for ( int i = 0 ; i < text.length(); i++ ) {

            char ch1 = text.charAt(i);

            if (ch1 >='A' && ch1 <= 'Z') {

                System.out.println(ch1);
            }
        }
    }
}
