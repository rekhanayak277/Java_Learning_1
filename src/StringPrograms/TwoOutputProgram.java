package StringPrograms;

public class TwoOutputProgram {

    // Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”


    public static void main(String[] args) {

        String str = "aBACbcEDed";

        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();

        for (char ch : str.toCharArray()){

            if (ch>='a' && ch<='z' ) {

                lowercase.append(ch);
            }

                else if (ch>= 'A' && ch<='Z'){

                        uppercase.append(ch);
                    }
                }


            System.out.println(lowercase);

            System.out.println(uppercase);

        }


        }

