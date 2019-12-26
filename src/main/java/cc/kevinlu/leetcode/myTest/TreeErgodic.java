package cc.kevinlu.leetcode.myTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeErgodic {
    public static void main(String[] args) {
        int[] tree = {7,9,5,2,6,8,10};
        Tree root = null;
        for (int i = 0; i < tree.length; i++) {
            root = insert(root,tree[i]);
        }
        //treeErgodic(root);
        //postOrder(root);
        scopeErgodic(root);


    }

    /**
     * 递归方法实现后序遍历，并打印
     * @param root
     */
    public static void postOrder(Tree root){
        if(root == null) return;
        postOrder(root.treeLeft);
        postOrder(root.treeRight);
        System.out.print(root.data + " ");
    }

    /**
     * 递归方法实现前序遍历，并打印
     * @param root
     */
    public static void firstOrder(Tree root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        firstOrder(root.treeLeft);
        firstOrder(root.treeRight);
    }

    /**
     * 栈实现二叉树深度遍历(先序遍历)
     * @param root
     */
    public static void treeErgodic(Tree root) {
        if(root==null) {
            return ;
        }
        Stack<Tree> stack=new Stack<>();
        stack.push(root);
        while(stack.isEmpty()==false) {
            Tree node=stack.pop();
            System.out.print(node.data+" ");
            if(node.treeRight!=null) {
                stack.push(node.treeRight);
            }
            if(node.treeLeft!=null) {
                stack.push(node.treeLeft);
            }
        }
    }

    /**
     * 队列实现二叉树广度遍历
     */
    public static void scopeErgodic (Tree node){
        Queue<Tree> queue = new LinkedList<>();
        if (node == null) return;
        queue.add(node);
        while (!queue.isEmpty()){
            Tree children = queue.poll();
            System.out.print(children.data + " ");
            if (children.treeLeft != null){
                queue.add(children.treeLeft);
            }
            if (children.treeRight != null){
                queue.add(children.treeRight);
            }
    }
    }


    /**
     * 二叉排序树；左边是小于等于，右边是大于根节点。
     * @param root
     * @param data
     * @return
     */
    public static Tree insert(Tree root, int data) {
        if (root == null) {
            return new Tree(data);//新建树节点
        }else {
            Tree cur;
            if (data <= root.data) {//小的放在左侧
                cur = insert(root.treeLeft,data);//递归一直到root为空时，调用第一个IF实现新建树节点
                root.treeLeft = cur;
            }else {//大的放在右侧
                cur = insert(root.treeRight,data);
                root.treeRight = cur;
            }
            return root;
        }
    }

}



class Tree {

    Tree treeLeft;
    Tree treeRight;//创建了树的两个分支，声明类型自己本身树，目的是每新建一个分支依旧为树的一个节点
    int data;

    Tree(int data){
        this.data = data;//data在这里是树节点（或分支）的值
        treeLeft = treeRight = null;
    }
}
