package cc.kevinlu.leetcode.cc;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 *
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 *
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 *  
 *
 * 提示：
 *
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122 
 * S 中不包含 \ or "
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 */
public class MainTest917 {

    public static void main(String[] args) {
        //        String s = "ab-cd";
        //        String s = "a-bC-dEf-ghIj";
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String S) {
        int start = 0, last = S.length() - 1;
        char[] cs = S.toCharArray();
        while (start < last) {
            if (!((cs[start] >= 'A' && cs[start] <= 'Z') || (cs[start] >= 'a' && cs[start] <= 'z'))) {
                start++;
                continue;
            }
            if (!((cs[last] >= 'A' && cs[last] <= 'Z') || (cs[last] >= 'a' && cs[last] <= 'z'))) {
                last--;
                continue;
            }
            char c = cs[start];
            cs[start] = cs[last];
            cs[last] = c;
            start++;
            last--;
        }
        return String.valueOf(cs);
    }

}
