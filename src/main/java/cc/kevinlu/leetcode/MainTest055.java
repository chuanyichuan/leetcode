package cc.kevinlu.leetcode;

public class MainTest055 {
    static Index[] type;
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        type = new Index[nums.length];
        for(int i = 0; i < nums.length; i++){
            type[i] = Index.UNKNOWN;
        }
        type[nums.length - 1] = Index.GOOD;
        return dfs(0, nums);
    }
    public static boolean dfs (int position, int[] nums){
        if(type[position] != Index.UNKNOWN){
            return type[position] == Index.GOOD ? true : false;
        }
        int furPosition = Math.min(nums[position] + position, nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <=  furPosition; nextPosition++){
            if(dfs(nextPosition, nums)){
                type[position] = Index.GOOD;
                return true;
            }
        }
        type[position] = Index.BAD;
        return false;
    }
}
enum Index {
    GOOD, BAD, UNKNOWN
}