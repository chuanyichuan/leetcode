package cc.kevinlu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest110 {
    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
        //层次遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return false;
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

    public static boolean isBalanced1 (TreeNode root){
        if(root == null) return true;
        int left = MaxDeth(root.left);
        int right = MaxDeth(root.right);
        if(isBalanced1(root.right) && isBalanced1(root.left) && Math.abs(left - right) < 1){
            return true;
        }
        return false;
    }
}