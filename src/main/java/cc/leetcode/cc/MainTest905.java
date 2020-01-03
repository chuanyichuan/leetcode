package cc.leetcode.cc;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 */
public class MainTest905 {

    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 4 };
        sortArrayByParity(A);
    }

    public static int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] b = new int[len];
        int j = 0, k = len - 1;
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                b[j] = A[i];
                j++;
            } else {
                b[k] = A[i];
                k--;
            }
        }
        return b;
    }

}
