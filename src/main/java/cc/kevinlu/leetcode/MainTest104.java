package cc.kevinlu.leetcode;

import java.util.ArrayList;

public class MainTest104 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};
        TreeNode root = recursiveTree(nums, 0, nums.length);
        maxDepth(root);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ergodic(root,ans);
    }
    //题目二叉树最大深度
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
    //递归的前序遍历
    public static ArrayList<Integer> ergodic (TreeNode root,ArrayList<Integer> ans){
        if (root == null){return ans;};
        ans.add(root.data);
        ergodic(root.left, ans);
        ergodic(root.right,ans);
        return ans;
    }

}