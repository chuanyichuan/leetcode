package cc.kevinlu.leetcode;

public class MainTest082 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(2);
        deleteDuplicates(listNode);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        while(head != null && head.next != null){
            if(head.val != head.next.val){
                pre = head;
                head = head.next;
            } else {
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                pre.next = head.next;
                head = head.next;
            }
        }
        return start.next;
    }
}