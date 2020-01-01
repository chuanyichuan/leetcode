package cc.kevinlu.leetcode.cc;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 */
public class MainTest035 {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, 7, 8, 9, 12, 14 };
        int target = 8;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }
        int start = 1;
        int end = nums.length - 2;
        while (start <= end) {
            int index = (start + end) / 2;
            if (target == nums[index]) {
                return index;
            } else if (target < nums[index]) {
                // 往下
                end = index - 1;
            } else {
                start = index + 1;
            }
        }

        return start;
    }

}
