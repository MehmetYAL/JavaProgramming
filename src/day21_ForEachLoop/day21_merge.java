package day21_ForEachLoop;

import java.util.Arrays;

public class day21_merge {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] result= new int[arr1.length+ arr2.length+ arr3.length];
        int j=0;

        for (int each : arr1) {
            result[j++]=each;
        }
        for (int each : arr2) {

            result[j++]=each;

        }
        for (int each : arr3) {
            result[j++]=each;

        }
        System.out.println(Arrays.toString(result));
    }
}
