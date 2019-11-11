package cc.kevinlu.leetcode;

import java.util.*;

public class MainTest107 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        if(root == null) return ans;
        queue1.add(root);
        while (!queue1.isEmpty()){
            temp = new ArrayList<>();
            while(!queue1.isEmpty()){
                TreeNode children = queue1.poll();
                if(children.left != null){
                    queue2.add(children.left);
                }
                if(children.right != null){
                    queue2.add(children.right);
                }
                temp.add(children.data);
            }
            while(!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
    }
}