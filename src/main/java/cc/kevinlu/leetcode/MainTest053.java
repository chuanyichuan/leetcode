package cc.kevinlu.leetcode;

public class MainTest053 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    }

    public static int maxSubArray(int[] nums) {
        int temp = 0;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(temp > 0){
                temp += nums[i];
            }else{
                temp = nums[i];
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}