package StringPrograms;

public class TwoOutput_Program1 {

    // Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”

    public static void main(String[] args) {

        String str = "aBACbcEDed";

        String uppercase = "";

        String lowercase = "";

        // With Wrapper class
       /* for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowercase += ch;

            } else if (Character.isUpperCase(ch)) {
                uppercase += ch;
            }
        }

        System.out.println(lowercase);  // Output: abcde
        System.out.println(uppercase);  // Output: ABCDE
    }
}
        */

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            if (ch1 >= 'a' && ch1 <= 'z') {

                lowercase += ch1;

                // System.out.print(lowercase += ch1);

            } else if (ch1 >= 'A' && ch1 <= 'Z') {

                uppercase += ch1;

            }

        }

            System.out.println(lowercase);  // Output: abcde
            System.out.println(uppercase);  // Output: ABCDE


        }
    }

