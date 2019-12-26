package cc.kevinlu.leetcode;

public class MainTest300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
    public static int dfs(int[] nums, int start, int end, int k) {
        if(start <= end){
            return -1;
        }
        int middle = (start + end) / 2;
        if(nums[middle] == k){
            return middle;
        }else if(nums[middle] < k){
            return dfs(nums, start, middle, k);
        } else {
            return dfs(nums, middle + 1, end, k);
        }
    }

    public static int findBinary(int[] nums, int k){
        if(nums.length == 0) return 0;
        return dfs(nums, 0, nums.length, k);
    }
}