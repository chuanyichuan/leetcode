package cc.kevinlu.leetcode.myTest;

import java.util.*;

public class TreeTest {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ans;
        inorderTraversal(root.left);
        ans.add(root.data);
        inorderTraversal(root.right);
        return ans;
    }
}
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}