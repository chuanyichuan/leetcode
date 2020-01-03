package cc.leetcode.cc;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 */
public class MainTest169 {

    public static void main(String[] args) {
        //        int[] nums = { 3, 2, 3 };
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    /**
     * 解题思路：
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int num = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                count++;
            } else if (num != nums[i] && count > 0) {
                count--;
            } else {
                num = nums[i];
                count = 1;
            }
        }
        return num;
    }

}
