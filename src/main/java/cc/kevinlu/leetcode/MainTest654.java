package cc.kevinlu.leetcode;

public class MainTest654 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        constructMaximumBinaryTree(nums);
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int start = 0, end = nums.length;
        return dfs(start, end, nums);
    }
    public static TreeNode dfs (int start, int end, int[] nums){
        if(start == end ) return null;
        int max = nums[start], index = start;
        for(int i = start; i < end; i++) {
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = dfs(start, index, nums);
        root.right = dfs(index + 1, end, nums);
        return root;
    }
}