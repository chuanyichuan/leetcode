package cc.kevinlu.leetcode;

import cc.kevinlu.leetcode.myTest.TreeErgodic.*;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.util.*;


public class MainTest102 {
    public static void main(String[] args) {
        int[] nums = {7, 9, 5, 2, 6, 8, 10};
        TreeNode root = null;
        for (int i = 0; i < nums.length; i++) {
            root = buildTree(root, nums[i]);
        }
        queenErgodic(root);
        stackErgodic(root);

        queueTwoErgodic(root);

        List<Integer> ans = new ArrayList<>();
        recursionErgodic(root, ans);

        inorderTraversal(root);
    }

    //使用栈实现二叉树中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ans.add(cur.data);
            cur = cur.right;
        }
        return ans;
    }

    //递归实现二叉树先序遍历
    public static List<Integer> recursionErgodic(TreeNode root, List<Integer> ans) {
        if (root == null) return ans;
        ans.add(root.data);
        recursionErgodic(root.left, ans);
        recursionErgodic(root.right, ans);
        return ans;
    }

    //使用双队列实现二叉树的层次遍历
    public static List<List<Integer>> queueTwoErgodic(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        if (root == null) return ans;
        queue1.add(root);
        while (!queue1.isEmpty()) {
            temp = new ArrayList<>();
            while (!queue1.isEmpty()) {
                TreeNode children = queue1.poll();
                if (children.left != null) {
                    queue2.add(children.left);
                }
                if (children.right != null) {
                    queue2.add(children.right);
                }
                temp.add(children.data);
            }
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            ans.add(temp);
        }
        //Collections.reverse(ans);
        return ans;
    }

    //二叉树使用栈深度遍历（先序遍历）
    public static List<Integer> stackErgodic(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode children = stack.pop();
            ans.add(children.data);
            if (children.right != null) {
                stack.add(children.right);
            }
            if (children.left != null) {
                stack.add(children.left);
            }
        }
        return ans;
    }

    //二叉树使用队列广度遍历
    public static List<Integer> queenErgodic(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode children = queue.poll();
            ans.add(children.data);
            if (children.left != null) {
                queue.add(children.left);
            }
            if (children.right != null) {
                queue.add(children.right);
            }
        }
        return ans;
    }

    //二叉树的建立
    public static TreeNode buildTree(TreeNode root, int i) {
        if (root == null) {

            root = new TreeNode(i);
        } else {
            if (i <= root.data) {
                root.left = buildTree(root.left, i);
            }
            if (i > root.data) {
                root.right = buildTree(root.right, i);
            }
        }
        return root;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
