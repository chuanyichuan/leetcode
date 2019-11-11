package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainTest040 {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(nums, target);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> now = new Stack<>();
        dfs(0, candidates, target, ans, now);
        return ans;
    }
    public static void dfs(int i, int[] nums, int target, List<List<Integer>> ans, Stack<Integer> now){
        if(i == nums.length){
            return;
        }
        for(int j = i; j < nums.length&& (target >= nums[j]); j++){
            if(i < j && nums[j] == nums[j-1]) continue;
            now.push(nums[j]);
            int result = now.peek();
            if(result == target){
                ans.add(new ArrayList<>(now));
            }
            dfs(j+1, nums, target - nums[j], ans, now);
            now.pop();
        }
    }
}