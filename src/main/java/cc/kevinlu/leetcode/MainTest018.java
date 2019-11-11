package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest018 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> now = new Stack<>();
        int temp = 4;
        dfs(0, temp, target, nums, ans, now);
        return ans;
    }
    public static void dfs(int i, int temp, int target, int[] nums, List<List<Integer>> ans, Stack<Integer> now){
        if(now.size() == temp){
            int sub = 0;
            for(int k : now){
                sub = sub + k;
            }
            if(sub == target){
                ans.add(new ArrayList(now));
                return;
            }
        }
        for(int j = i; j < nums.length; j++){
            now.push(nums[j]);
            dfs(i+1, temp, target, nums, ans, now);
            now.pop();
        }
    }
}
