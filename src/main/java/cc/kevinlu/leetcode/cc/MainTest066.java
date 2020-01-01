package cc.kevinlu.leetcode.cc;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 */
public class MainTest066 {

    public static void main(String[] args) {
        int[] digits = { 4, 3, 2, 1 };
        digits = plusOne(digits);
        Arrays.stream(digits).boxed().forEach(v -> System.out.print(v + ", "));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int sum = digits[len - 1] + 1;
        if (sum <= 9) {
            digits[len - 1] = sum;
            return digits;
        }
        digits[len - 1] = sum - 10;
        int index = 1;
        for (int i = len - 2; i >= 0; i--) {
            sum = digits[i] + index;
            if (sum <= 9) {
                digits[i] = sum;
                return digits;
            }
            digits[i] = sum - 10;
        }
        int tlen = len + 1;
        int[] r = new int[tlen];
        r[0] = 1;
        for (int i = 1; i < tlen; i++) {
            r[i] = digits[i - 1];
        }
        return r;
    }
}
