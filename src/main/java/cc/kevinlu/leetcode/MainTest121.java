package cc.kevinlu.leetcode;

public class MainTest121 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        maxProfitTwo(nums);
    }

    //暴力法
    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                ans = Math.max(ans, prices[j] - prices[i]);
            }
        }
        return ans;
    }

    //暴力法的优化
    public static int maxProfitTwo(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            ans = Math.max(prices[i] - min, ans);
            min = Math.min(min, prices[i]);
        }
        return ans;
    }
}