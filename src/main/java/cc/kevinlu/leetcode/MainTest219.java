package cc.kevinlu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MainTest219 {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (; i < size; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        int i = 0, j, size = nums.length;
        for (; i < size; i++) {
            j = i + 1;
            for (; j - i <= k && j < size; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
