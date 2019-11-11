package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest016 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        collectionSort(nums,target);
    }
    //从N个数中取M个数的全排列
    public static int collectionSort (int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> now = new Stack<>();
        int[] abs = {Integer.MAX_VALUE,0};
        dfs(nums,0, target, ans, now, abs);
        return abs[1];

    }
    public static void dfs(int[] nums, int i, int target, List<List<Integer>> ans, Stack<Integer> now, int[] abs){
        if(now.size() == 3){
            int result = 0;
            for(int k : now){
                result = result + k;
            }
            int temp = Math.abs(target - result);
            if(temp < abs[0]){
                abs[0] = temp;
                abs[1] = target;
                return;
            }

        }
        for(int j = i; j < nums.length; j++){
            now.push(nums[j]);
            dfs(nums, j+1, target, ans, now, abs);
            now.pop();
        }
    }
}

