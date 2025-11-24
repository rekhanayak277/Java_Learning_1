package StringPrograms;

public class CountVowelAndConsonants {

    // Java program to Count Vowels and Consonants in a given string "GoodmorningBadNight"

    public static void main(String[] args) {

        String text = "GoodmorningBadNight";

        int vowels = 0;
        int consonents = 0;

        text =  text.toLowerCase();

       for (int i=0 ; i < text.length(); i++) {

           char ch1 = text.charAt(i);

           if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 =='o' || ch1 == 'u') {
               vowels ++;

           }

           else {
               consonents ++;

           }
       }

        System.out.println("Vowels : " + vowels );
        System.out.println("Consonents : " + consonents );

    }


}
