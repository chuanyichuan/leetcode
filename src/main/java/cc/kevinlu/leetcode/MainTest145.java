package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MainTest145 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode leftL = new TreeNode(4);
        TreeNode leftR = new TreeNode(5);
        TreeNode rightL = new TreeNode(6);
        TreeNode rightR = new TreeNode(7);
        root.left = left;
        root.right = right;
        left.left = leftL;
        left.right = leftR;
        right.right = rightR;
        right.left = rightL;
        //TreeNode = new TreeNode(1);
        postorderTraversal001(root);
    }
    public  List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root ==  null) return ans;
        return recursion(root, ans);
    }
    public  List<Integer> recursion(TreeNode root, ArrayList ans) {
        if(root == null) return null;
        recursion(root.left, ans);
        recursion(root.right, ans);
        ans.add(root.data);
        return ans;
    }

    public static List<Integer> postorderTraversal001(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.addFirst(node.data);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }
}