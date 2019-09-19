package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest442 {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = findDuplicates(nums);
        System.out.println(list);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0, size = nums.length; i < size; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] *= -1;
            } else {
                result.add(num);
            }
        }
        return result;
    }

}
