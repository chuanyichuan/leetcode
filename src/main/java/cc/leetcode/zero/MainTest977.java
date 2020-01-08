package cc.leetcode.zero;

import java.util.Arrays;

/**
 * @author zero
 * @date 2020/1/8 9:43 下午
 */
public class MainTest977 {

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    /**
     * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     * 示例 1：
     * <p>
     * 输入：[-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 示例 2：
     * <p>
     * 输入：[-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     */

    private static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        quickSort(A);
        int i = 0;
        while (i < A.length) {
            result[i] = (int) Math.pow((double) A[i++], 2);
        }
        return result;
    }

    private static void quickSort(int[] a) {
        quickSortC(a, 0, a.length - 1);
    }

    private static void quickSortC(int[] a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int privot = getPrivot(a, begin, end);
        quickSortC(a, begin, privot - 1);
        quickSortC(a, privot + 1, end);

    }

    private static int getPrivot(int[] a, int begin, int end) {
        int i = begin;
        for (int j = begin; j < end; j++) {
            if (Math.abs(a[j]) < Math.abs(a[end])) {
                if (i != j) {
                    a[i] ^= a[j];
                    a[j] ^= a[i];
                    a[i] ^= a[j];
                }
                i++;
            }
        }
        if (i != end) {
            a[i] ^= a[end];
            a[end] ^= a[i];
            a[i] ^= a[end];
        }
        return i;
    }
}
