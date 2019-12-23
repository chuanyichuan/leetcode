package cc.kevinlu.leetcode;

public class MainTest572 {
    public static void main(String[] args) {

    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    public boolean isSame (TreeNode s, TreeNode t){
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        return s.data == t.data && isSame(s.right, t.right) && isSame(s.left ,t.left);
    }
}