package cc.kevinlu.leetcode;

public class MainTest617 {
    public static void main(String[] args) {

    }
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        TreeNode ans = new TreeNode(0);
        if(!(t1 == null && t2 == null)){
            if(t1 == null && t2 != null){
                ans.data = t2.data;
            }else if(t2 == null && t1 != null){
                ans.data = t1.data;
            }else{
                ans.data = t1.data + t2.data;
            }
            ans.left = mergeTrees1(t1== null? t1 : t1.left, t2 == null ? t2 : t2.left);
            ans.right = mergeTrees1(t1== null? t1 : t1.right, t2 ==null ? t2 : t2.right);
        }else{
            return null;
        }
        return ans;
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        t1.data = t2.data + t1.data;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}