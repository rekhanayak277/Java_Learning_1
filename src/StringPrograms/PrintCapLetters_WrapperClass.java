package StringPrograms;

public class PrintCapLetters_WrapperClass {

    //Java program to print only capital letter in a given string "JavaIsaprogRamMinGlangUage" - Wrapper Class


    public static void main(String[] args) {

        String text = "JavaIsaprogRamMinGlangUage";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Using Character wrapper class

            if (Character.isUpperCase(ch)) {
                System.out.print(ch);


            }

        }

    }
}