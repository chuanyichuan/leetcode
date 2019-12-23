package cc.kevinlu.leetcode;

import java.util.Stack;

public class MainTest114 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        flatten(treeNode);
    }
    public static void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        curr.right = temp;
    }


    //非原地
    public static void flatten1(TreeNode root) {
        //二叉树前序遍历
        if (root == null) return;
        TreeNode newRoot = new TreeNode(0);
        TreeNode temp = newRoot;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while(stack.size() != 0){
            TreeNode children = stack.pop();
            if(children.right != null){
                stack.push(children.right);
            }
            if(children.left != null){
            stack.push(children.left);
            }
            temp.right = new TreeNode(children.data);
            temp = temp.right;
    }
        root = newRoot.right;
        System.out.println(1);
}
}