package cc.kevinlu.leetcode.cc;

import java.util.Arrays;

public class MainTest1089 {

    public static void main(String[] args) {
        //        int[] arr = { 1, 5, 2, 0, 6, 8, 0, 6, 0 };
        int[] arr = { 1, 0, 2, 3, 0, 0, 5, 0 };
        duplicateZeros(arr);
        Arrays.stream(arr).forEach(v -> System.out.print(v + ","));
    }

    public static void duplicateZeros(int[] arr) {
        int maxIndex = 0, sIndex = 0;
        for (int a : arr) {
            if (maxIndex >= arr.length) {
                break;
            }
            if (a == 0) {
                ++maxIndex;
            }
            maxIndex++;
            sIndex++;
        }
        int i = arr.length - 1;
        if (arr[sIndex - 1] == 0) {
            arr[i] = 0;
            i--;
            sIndex--;
            if (maxIndex == arr.length) {
                arr[i] = 0;
                i--;
            }
        }
        for (; i >= 0; i--) {
            arr[i] = arr[sIndex - 1];
            if (arr[sIndex - 1] == 0) {
                arr[--i] = 0;
            }
            sIndex--;
        }
    }

}
