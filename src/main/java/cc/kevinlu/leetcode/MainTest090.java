package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest090 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        subsetsWithDup(nums);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        dfs(nums, 0, ans, path);
        return ans;
    }

    public static void dfs(int[] nums, int u, List<List<Integer>> ans, Stack<Integer> path) {
        if (u == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        int k = 0;
        while (((u + k) < nums.length) && (nums[u] == nums[u + k])) k++;
        for (int i = 0; i <= k; i++ ){
            dfs(nums, u + k, ans, path);
            path.push(nums[u]);
        }
        for (int i = 0; i <= k; i++ ) path.pop();
    }

}
