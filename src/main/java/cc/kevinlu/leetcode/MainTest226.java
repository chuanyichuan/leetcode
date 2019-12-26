package cc.kevinlu.leetcode;

public class MainTest226 {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}