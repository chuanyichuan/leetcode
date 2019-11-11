package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest216 {

    public static void main(String[] args) {

        combinationSum3(3);
        combinationSum3(3,7);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        Stack<Integer> now =  new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        blackAdd(0, nums, k, n, ans, now);
        return ans;
    }

    public static void blackAdd(int i, int[] nums, int k, int n, List<List<Integer>> ans, Stack<Integer> now){

        if(now.size() == k){
            int sum = 0;
            for(int p : now){
                sum += p;
            }
            if(sum == n)
            ans.add(new ArrayList<>(now));
            return;
        }
        for(int j = i; j < nums.length; j++){
            if (j > i && nums[j] == nums[j - 1]) continue;
            now.push(nums[j]);
            blackAdd(j+1, nums, k, n, ans, now);
            now.pop();
        }
    }

    //从n个数中取m个的所有集合+去重
    public static List<List<Integer>> combinationSum3(int n) {
        int[] nums = {1,1,3,4};
        Stack<Integer> now =  new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        black(0, nums, n, ans, now);
        return ans;
    }
    public static void black(int i, int[] nums, int n, List<List<Integer>> ans, Stack<Integer> now){
        if(now.size() == n){
            ans.add(new ArrayList<>(now));
            return;
        }
        for(int j = i; j < nums.length; j++){
            if (j > i && nums[j] == nums[j - 1]) continue;
            now.push(nums[j]);
            black(j+1, nums, n, ans, now);
            now.pop();
        }
    }
}

