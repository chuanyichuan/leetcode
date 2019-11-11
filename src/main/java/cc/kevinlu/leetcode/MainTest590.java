package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest590 {

    //N叉树后序遍历
    public List<Integer> postorder(Node root) {
        List<Integer> now = new ArrayList<>();
        postDfs(root, now);
        return now;
    }

    public static void postDfs(Node root, List<Integer> now){
        if(root == null) return;
        List<Node> nodeList = root.children;
        for(Node node : nodeList){
            postDfs(node, now);
        }
        now.add(root.val);

    }
}
