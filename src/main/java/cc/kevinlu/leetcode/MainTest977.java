package cc.kevinlu.leetcode;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */
public class MainTest977 {

    public static void main(String[] args) {
        //        int[] nums = { -7, -3, 2, 3, 11 };
        int[] nums = { -4, -1, 0, 3, 10 };
        Arrays.stream(sortedSquares(nums)).forEach(v -> System.out.println(v));
    }

    public static int[] sortedSquares(int[] A) {
        int[] r = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            r[i] = A[i] * A[i];
        }

        Arrays.sort(r);

        return r;
    }

}
