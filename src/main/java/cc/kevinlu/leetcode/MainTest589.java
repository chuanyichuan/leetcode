package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest589 {
    public static void main(String[] args) {

    }
    //N叉树前序遍历
    public List<Integer> preorder(Node root) {
        List<Integer> now = new ArrayList<>();
        preDfs(root,now);
        return now;

    }
    public static void preDfs(Node root, List<Integer> now){
        if(root == null) return;
        now.add(root.val);
        List<Node> nodeList = root.children;
        for(Node node : nodeList){
            preDfs(node, now);
        }
    }

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
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
