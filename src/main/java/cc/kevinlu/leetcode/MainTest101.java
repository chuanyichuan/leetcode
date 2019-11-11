package cc.kevinlu.leetcode;

public class MainTest101 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return symmetricCheck(root, root);
    }
    public static boolean symmetricCheck(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.data != right.data) return false;
        return symmetricCheck(left.left, right.right) && symmetricCheck(left.right, right.left);
    }
}