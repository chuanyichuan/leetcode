package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest015 {
    public static void main(String[] args) {
        //int [] nums= {-4,-1,-1,-1,0,1,2,3,3,3};
        int[] nums = {0, 0, 0};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] > 0) return result;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int right = nums.length - 1;
            int left = i + 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> headList = new ArrayList<>();
                    headList.add(nums[i]);
                    headList.add(nums[left]);
                    headList.add(nums[right]);
                    while (left < right && nums[left + 1] == nums[left]) left++;
                    while (left < right && nums[right - 1] == nums[right]) right--;
                    left++;
                    right--;
                    result.add(headList);
                }
                if (sum < 0) left++;
                if (sum > 0) right--;
            }
        }
        return result;
    }
}


