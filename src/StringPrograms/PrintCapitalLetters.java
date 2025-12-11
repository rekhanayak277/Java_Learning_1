package StringPrograms;

// Java program to print only capital letter in a given string "JavaIsaprogRamMinGlangUage"

public class PrintCapitalLetters {

    public static void main(String[] args) {

        String text = "JavaIsaprogRamMinGlangUage";

        for (int i = 0; i < text.length(); i++) {

            char ch1 = text.charAt(i);

      /*      if (ch1 >='A' && ch1 <= 'Z') {

                System.out.print(ch1);
            }
        }
    }
} */

            // with wrapper class -

            // for ( int i = 0 ; i < text.length(); i++ ) {

            //    char ch1 = text.charAt(i);

            if (Character.isUpperCase(ch1)) {

                System.out.print( "  " +ch1);
            }

        }
    }
}


