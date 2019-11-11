package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainTest047 {


    public static void main(String[] args) {
        /*List<List<Integer>> ansss = new ArrayList<>();
         Stack<Integer> pathss = new Stack<>();
         pathss.add(1);
         pathss.add(2);
         ansss.add(new ArrayList<>(pathss));
         pathss.remove(0);*/
        int[] nums = {1,1,3};
        permute(nums);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        int n = nums.length;
        boolean[] st = new boolean[n];
        Arrays.sort(nums);
        dfs(nums, 0,st,ans, path);
        return ans;
    }
    public static  void dfs(int[] nums, int u, boolean[] st, List<List<Integer>> ans, Stack<Integer> path){
        if(u == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j = 0; j < nums.length; j++){
            if (j> 0 && nums[j] == nums[j - 1] && !st[j-1]) {
                continue;
            }
            if(!st[j]){
                st[j] = true;
                path.push(nums[j]);
                dfs(nums,u+1,st, ans, path);
                path.pop();
                st[j] = false;
            }
        }
    }
}
