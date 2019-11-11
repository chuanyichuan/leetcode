package cc.kevinlu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest104 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};
        TreeNode root = recursiveTree(nums, 0, nums.length);
        maxDepth(root);
    }
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int ans = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        return ans;
    }
    public static TreeNode recursiveTree (int[] nums, int start, int end){
        if(start == end) return null;
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.right = recursiveTree(nums, middle + 1, end);
        root.left = recursiveTree(nums, start, middle);
        return root;
    }
}