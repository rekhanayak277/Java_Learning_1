package LoopPrograms;

public class TableOf10_While {
     /*
    Table of 10
        Logic here:
    Print - 10 20 30 40 .......200
    Use a variable, increment by 10
            */
     public static void main(String[] args) {


    int n1 = 10;

    while (n1<=200) {

        System.out.println(n1);

        n1 = n1 + 10;
    }
    }
}


