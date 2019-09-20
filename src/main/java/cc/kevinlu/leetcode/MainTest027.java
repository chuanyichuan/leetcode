package cc.kevinlu.leetcode;

import java.util.Arrays;

public class MainTest027 {
    public static void main(String[] args) {
        //int[] a = {0, 0, 1, 2, 2, 2, 3, 4};
        int[] a = {2,2,2};
        removeElement(a, 3);
    }

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int temp = 0, sub = 0,result = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = i;
            if (nums[i] == val) break;
            result++;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            sub = j;
            if (nums[j] == val) break;
            result++;
        }
        if(result == nums.length*2) return nums.length;
        for(int k = sub+1;k<nums.length; k++ ){
            nums[temp] = nums[k];
            temp++;
        }
        return result;
    }
}
