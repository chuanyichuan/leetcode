package cc.kevinlu.leetcode;

import java.util.ArrayList;

public class MainTest152 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    }
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int imax = 1, imin = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            ans = Math.max(ans, imax);
        }
        return ans;

    }
}