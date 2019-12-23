package cc.kevinlu.leetcode.Interview;


public class LinkedNodeAdd {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(3);
        listNode2.next = new ListNode(4);
        //reverserListNode(listNode);
        listNodeAdd(listNode, listNode2);
    }
    public static ListNode listNodeAdd(ListNode node1, ListNode node2){
        ListNode listNode1 = reverserListNode(node1);
        ListNode listNode2 = reverserListNode(node2);
        ListNode start = new ListNode(0);
        ListNode cur = start;
        int temp = 0;
        while (listNode1 != null || listNode2 != null){
            int nodeVal = listNode1 == null ? 0 : listNode1.val;
            int nodeVa2 = listNode2 == null ? 0 : listNode2.val;
            int sum = nodeVal + nodeVa2 + temp;
            temp = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(listNode1 != null) {
                listNode1 = listNode1.next;
            }
            if(listNode2 != null) {
                listNode2 = listNode2.next;
            }
        }
        if(temp == 1){
            cur.next = new ListNode(1);
        }

        return reverserListNode(start.next);


    }

    public static ListNode reverserListNode (ListNode head){
        ListNode curr = head, pre = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}