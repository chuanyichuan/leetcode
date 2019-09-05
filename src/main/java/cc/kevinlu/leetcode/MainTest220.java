package cc.kevinlu.leetcode;

import java.util.TreeSet;

public class MainTest220 {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1, t = 2;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i = 0, size = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (; i < size; i++) {
            Long v = set.ceiling((long) nums[i] - (long) t);
            System.out.println("v:" + v);
            if (v != null && v <= ((long) nums[i] + (long) t)) {
                return true;
            }
            set.add((long) nums[i]);
            if (set.size() == k + 1) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
        int i = 0, j, size = nums.length;
        for (; i < size; i++) {
            j = i + 1;
            for (; j - i <= k && j < size; j++) {
                long n = Math.abs((long) nums[i] - (long) nums[j]);
                if (n > Integer.MAX_VALUE) {
                    return false;
                }
                if (Math.abs(nums[i] - nums[j]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }

}
