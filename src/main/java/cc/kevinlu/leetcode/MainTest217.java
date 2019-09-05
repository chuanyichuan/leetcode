package cc.kevinlu.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MainTest217 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        containsDuplicate(nums);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int s : nums) {
            set.add(s);
        }
        return set.size() != nums.length;
    }

}
