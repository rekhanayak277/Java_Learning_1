package LoopPrograms;

public class TableOf5_multiplevariables_While {

    public static void main(String[] args) {
        int i1 = 5 ;

        int i2 = 1;

        while (i2 <= 10)
        {

            int i3 = i1 * i2;

            System.out.println(i1 + "*" + i2 + "=" + i3);
            i2 = i2 + 1;
        }
    }
}




