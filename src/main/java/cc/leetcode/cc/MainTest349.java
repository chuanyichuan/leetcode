package cc.leetcode.cc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 */
public class MainTest349 {

    public static void main(String[] args) {
        int[] num1 = { 4, 9, 5 }, num2 = { 9, 4, 9, 8, 4 };
        System.out.println(intersection(num1, num2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        Set<Integer> ls = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                ls.add(num);
            }
        }
        int[] rs = new int[ls.size()];
        Iterator<Integer> li = ls.iterator();
        int i = 0;
        while (li.hasNext()) {
            rs[i] = li.next();
            i++;
        }
        return rs;
    }

}
