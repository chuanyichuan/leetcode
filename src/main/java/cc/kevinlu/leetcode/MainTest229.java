package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest229 {
    public static void main(String[] args) {
        int[] nums = {1};
        majorityElement(nums);
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]) + 1;
                map.put(nums[i], value);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        map.forEach((key, value) -> {
            if(value > nums.length / 3){
                ans.add(key);
            }
        });
        return ans;
    }
}