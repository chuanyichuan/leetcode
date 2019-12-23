package cc.kevinlu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest100 {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.data != q.data) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public boolean isBalanced(TreeNode root) {
        //层次遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return true;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode children = queue.poll();
            int deference = Math.abs(MaxDeth(children.left) - MaxDeth(children.right));
            boolean dethDeference = deference > 1 ? false : true;
            if(dethDeference == false) return false;
            if(children.left != null){
                queue.add(children.left);
            }
            if(children.right != null){
                queue.add(children.right);
            }
        }
        return true;
    }
    public static int MaxDeth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(MaxDeth(root.left), MaxDeth(root.right));
    }
}