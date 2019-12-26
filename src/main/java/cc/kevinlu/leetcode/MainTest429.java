package cc.kevinlu.leetcode;

import java.util.*;

public class MainTest429 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                temp.add(node.val);
                for (Node children : node.children) {
                    if ( children != null)
                    queue.add(children);
                }
            }
            ans.add(temp);
        }
        return ans;

    }
}
