package ArrayPrograms;

import java.util.Arrays;

public class SortGivenArray {

    // 114.  Sort an array = {4,8,33,6,9,42,121,6,7}


    public static void main(String[] args) {

        int[] arr1 = {4, 8, 33, 6, 9, 42, 121, 6, 7};

        Arrays.sort(arr1);  // built-in sorting method


        for (int num : arr1) {       // print after sorting array

            System.out.print(num + " ");
        }
    }

}
