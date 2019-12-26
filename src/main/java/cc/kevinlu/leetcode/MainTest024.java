package cc.kevinlu.leetcode;

public class MainTest024 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {return head;}
        ListNode next =  head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}