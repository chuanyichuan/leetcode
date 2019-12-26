package cc.kevinlu.leetcode;

import java.util.ArrayList;

public class MainTest011 {
    public static void main(String[] args) {
        int[] height  = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int result = 0;
        while (left < right){
            result = Math.max(result , Math.min(height[right],height[left])*(right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;

    }
}
