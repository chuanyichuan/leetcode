package cc.kevinlu.leetcode;

public class MainTest543 {
    public static void main(String[] args) {

    }
    public int diameterOfBinaryTree(TreeNode root) {
        return maxDepth(root.right) + maxDepth(root.left) + 1;
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return left > right ? left : right;
    }
}