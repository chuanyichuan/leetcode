package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest051 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> solveNQueens() {
        int[] nums = {1, 2, 3, 4};
        Stack<Integer> now = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] state = new boolean[4];
        dfs(0, nums, now, ans, state);
        return ans;
    }

    public static void dfs(int i, int[] nums, Stack<Integer> now,
                           List<List<Integer>> ans, boolean[] state) {
        for (int j = 0; j < nums.length; j++) {
            if (!state[j]) {
                now.push(nums[j]);
                if (j == 0) {
                    state[j] = true;
                    state[j + 1] = true;
                } else if (0 < j && j < nums.length - 1) {
                    state[j - 1] = true;
                    state[j] = true;
                    state[j + 1] = true;
                } else {
                    state[j - 1] = true;
                    state[j + 1] = true;
                }
                dfs(i + 1, nums, now, ans, state);


            }


        }
    }
}
