package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest034 {
    public static void main(String[] args) {
    int[] a = {5,6,7,7,7,10};
    searchBy(a,7,0,5);

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int index = searchBy(nums, target, 0, nums.length-1);
        if(index == -1) return ans;

        int start = index, end = index;
        while(start > 0 && nums[start] == nums[start - 1]){
            start --;
        }
        while(end < nums.length - 1 && nums[end + 1] == nums[end]){
            end ++;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public static int searchBy(int[] nums, int target,int left, int right){
        int middle = (left + right)/2;
        if(left > right) return -1;
        if(nums[middle] == target){
            return middle;
        } else if (nums[middle] < target){
            return searchBy(nums, target, middle+1, right);
        }else {
            return searchBy(nums, target, left, middle-1);
        }

    }
}
