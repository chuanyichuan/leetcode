package cc.kevinlu.leetcode;

public class MainTest234 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        isPalindrome(listNode);

    }

    public static boolean isPalindrome(ListNode head) {

        //反转链表
     /*   ListNode curr = head, pre = null, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }*/
        int length = 0;ListNode curr = head;
        {
            while (curr != null) {
                curr = curr.next;
                length++;
            }
        }
        curr = head;
        ListNode pre = null, next = null;
        //反转前一半链表
        {
            for (int i = 0; i < length / 2; i++) {
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
        }
        if (length % 2 == 1) curr = curr.next;
        {
            while (pre != null && curr != null && pre.val == curr.val) {
                pre = pre.next;
                curr = curr.next;
            }
        }
        if (pre == null && curr == null) return true;
        return false;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
