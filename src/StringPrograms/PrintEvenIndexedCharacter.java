package StringPrograms;

public class PrintEvenIndexedCharacter {

    //Java program to print even indexed character in a given string "GoodmorningBadNight"

    public static void main(String[] args) {

        String text = "GoodmorningBadNight";

        for (int i=0 ; i < text.length(); i++) {

            if (i % 2 ==0) {

                System.out.println(text.charAt(i));
            }
        }

    }
}
