package cc.leetcode.cc;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 *
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 *
 * 还有，自除数不允许包含 0 。
 *
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 示例 1：
 *
 * 输入： 
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 注意：
 *
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 */
public class MainTest728 {

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        String s;
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            s = String.valueOf(i);
            if (s.contains("0")) {
                continue;
            }
            char[] c = s.toCharArray();
            int d = 0;
            boolean r = true;
            while (d < c.length) {
                if (i % Character.getNumericValue(c[d]) != 0) {
                    r = false;
                    break;
                }
                d++;
            }
            if (r) {
                result.add(i);
            }
        }
        return result;
    }

}
