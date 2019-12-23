package cc.kevinlu.leetcode;

public class MainTest198 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        rob(nums);
    }
    public static int rob(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        int[] temp = new int [length];
        if(length == 1){
            return nums[0];
        }else{
            temp[0] = nums[0];
            temp[1] = Math.max(nums[0], nums[1]);
            for(int j = 2; j < length; j++){
                temp[j] = Math.max(temp[j - 1], temp[j - 2] + nums[j]);
            }
        }
        return temp[length - 1];
    }
}