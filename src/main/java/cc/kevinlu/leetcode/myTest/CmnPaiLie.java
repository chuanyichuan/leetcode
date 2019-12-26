package cc.kevinlu.leetcode.myTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CmnPaiLie {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        collectionSort(nums, 3);
    }
    //从N个数中取M个数的全排列
    public static List<List<Integer>> collectionSort (int[] nums, int m){
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> now = new Stack<>();
        dfs(nums,0, m, ans, now);
        return ans;

    }
    public static void dfs(int[] nums, int i, int m, List<List<Integer>> ans, Stack<Integer> now){
        if(now.size() == m){
            ans.add(new ArrayList<>(now));
            return;
        }
        for(int j = i; j < nums.length; j++){
            now.push(nums[j]);
            dfs(nums, j+1, m, ans, now);
            now.pop();
        }
    }
}
