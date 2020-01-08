package cc.leetcode.zero;

import java.util.Arrays;

/**
 * @author zero
 * @date 2020/1/8 9:31 下午
 */
public class MainTest905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    /**
     *给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
     * 你可以返回满足此条件的任何数组作为答案。
     * 示例：
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     */

    private static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = 0;
        for (; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                if (i != j) {
                    A[i] ^= A[j];
                    A[j] ^= A[i];
                    A[i] ^= A[j];
                }
                i++;
            }
        }
        return A;
    }
}

