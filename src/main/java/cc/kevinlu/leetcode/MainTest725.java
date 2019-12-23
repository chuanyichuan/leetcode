package cc.kevinlu.leetcode;

public class MainTest725 {
    public static void main(String[] args) {
        int[] ints = new int[5];

    }
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] listNode = new ListNode[k];
        if(root == null) return  listNode;
        ListNode cur = root;
        int length = 0;
        while(cur != null){
            cur = cur.next;
            length++;
        }
        if(length <= k){
            for(int i = 0; i < length; i++) {
                ListNode next = root.next;
                root.next = null;
                listNode[i] = root;
                root = next;
            }
            for(int j = length; j < k; j++) {
                listNode[j] = null;
            }
        } else {
            int sub = length % k;
            int temp = length / k;
            ListNode curr = root, pre = root;
            for(int i = 0; i < sub; i++) {
                listNode[i] = curr;
                for(int j = 0; j < temp + 1; j++) {
                    pre = curr;
                    curr = curr.next;
                }
                pre.next = null;
            }
            for(int j = sub; j < k; j++) {
                listNode[j] = curr;
                for(int m = 0; m < temp; m++) {
                    pre = curr;
                    curr = curr.next;
                }
                pre.next = null;
            }
        }
        return listNode;
    }
}