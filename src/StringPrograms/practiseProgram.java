package StringPrograms;

public class practiseProgram {
    public static void main(String[] args) {
        String s = "Java programming";
        String[] f = s.split("p"); //{"Java","programming"}
        //spilt --> it will always return array of string
        System.out.println(f.length);

     /*   String w = "Java";
        char[] a = w.toCharArray(); // {'J','a','v','a'}
        //tocharArray -> it will always return array of character


        String y = "  ";
        System.out.println(y.isBlank()); //true
        System.out.println(y.isEmpty()); //false */
    }
}
