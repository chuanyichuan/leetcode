package cc.leetcode.cc;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 */
public class MainTest389 {

    public static void main(String[] args) {
        String s = "a", t = "aa";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int[] chArray = new int[200];
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        for (char cs : chs) {
            chArray[cs] = chArray[cs] + 1;
        }
        for (char ct : cht) {
            if (chArray[ct] == 0) {
                return ct;
            } else {
                chArray[ct] = chArray[ct] - 1;
            }
        }
        return '\n';
    }

}
