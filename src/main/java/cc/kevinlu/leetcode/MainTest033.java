package cc.kevinlu.leetcode;

public class MainTest033 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(search(nums, 1));

    }
    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        if(j == -1) return -1;
        while(i<nums.length&&target>=nums[i]){
            if(target == nums[i]) return i;
            i++;
        }
        while(j>=0&&target<=nums[j]){
            if (target == nums[j]) return j;
            j--;
        }
        return -1;
    }
}
