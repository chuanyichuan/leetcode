package cc.kevinlu.leetcode;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainTest039 {

    public static void main(String[] args) {

        int[] nums = {2,3,5};
        int target = 8;
        combinationSum(nums, target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> now = new Stack<>();
        Arrays.sort(candidates);
        dfs(candidates, ans, now, target);
        return ans;
    }
    public static void dfs(int[] candidates, List<List<Integer>> ans, Stack<Integer> now, int target){
        if(target == 0){
            ans.add(new ArrayList<>(now));
            return;
        } else if(target < 0){
            return;
        }
        for(int i = 0; i < candidates.length && (target >= candidates[i]); i++){
            if(now.size() == 0 || now.peek() <= candidates[i]) {
                now.push(candidates[i]);
                dfs(candidates, ans, now, target - candidates[i]);
                now.pop();
            }

        }
    }
}