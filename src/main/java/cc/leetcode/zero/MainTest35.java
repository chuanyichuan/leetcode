package cc.leetcode.zero;

/**
 * @author zero
 * @date 2020/1/2 11:02 上午
 */
public class MainTest35 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6};
        System.out.println(searchInsert(nums, 2));
    }

    /**
      给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
      你可以假设数组中无重复元素。
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
