package cc.kevinlu.leetcode;

public class MainTest206 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        ListNode next =  null;
        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
