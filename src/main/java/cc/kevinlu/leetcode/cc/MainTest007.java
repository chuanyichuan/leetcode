package cc.kevinlu.leetcode.cc;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 */
public class MainTest007 {

    public static void main(String[] args) {
        int s = 123;
        System.out.println(reverse(s));
    }

    public static int reverse(int s) {
        int result = 0;
        int x = s;
        while (x != 0) {
            int tmp = result * 10 + x % 10;
            if (tmp / 10 != result) {
                return 0;
            }
            result = tmp;
            x = x / 10;
        }
        if ((s < 0 && result > 0) || (s > 0 && result < 0)) {
            return (0);
        } else {
            return (result);
        }
    }

    public static int reverse1(int x) {
        int f = x < 0 ? -1 : 1;
        String s = String.valueOf(x);
        char[] cc = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int index = x < 0 ? 1 : 0;
        for (int i = cc.length - 1; i >= index; i--) {
            sb.append(cc[i]);
        }
        try {
            if (f == -1) {
                sb.insert(0, "-");
            }
            return Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
