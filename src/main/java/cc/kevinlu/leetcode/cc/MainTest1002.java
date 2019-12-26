package cc.kevinlu.leetcode.cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 */
public class MainTest1002 {

    public static void main(String[] args) {
        //        String[] A = { "bella", "label", "roller" };
        String[] A = { "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd" };
        System.out.println(commonChars(A));
    }

    public static List<String> commonChars(String[] A) {
        int[] len = new int[26];
        char[] c = A[0].toCharArray();
        for (int i = 0; i < c.length; i++) {
            len[c[i] - 97] += 1;
        }
        for (int i = 1; i < A.length; i++) {
            c = A[i].toCharArray();
            int[] lenj = new int[26];
            for (int j = 0; j < c.length; j++) {
                lenj[c[j] - 97] += 1;
            }
            for (int k = 0; k < 26; k++) {
                len[k] = len[k] > lenj[k] ? lenj[k] : len[k];
            }
        }
        Arrays.stream(len).boxed().forEach(v -> System.out.print(v + ","));
        System.out.println();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len.length; i++) {
            for (int j = 0; j < len[i]; j++) {
                list.add((char) ('a' + i) + "");
            }
        }

        return list;
    }

}
