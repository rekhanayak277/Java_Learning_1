package StringPrograms;

public class RemoveSpaceFromString {

    // Java program to remove space from a given String "Java is a very good programming language"

    public static void main(String[] args) {

        String givenText = "Java is a very good programming language";

        givenText = givenText.replace(" ", "");

        System.out.println(givenText);

    }
}
