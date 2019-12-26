package cc.kevinlu.leetcode;

public class MainTest203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        while(pre.next != null){
            while(pre.next != null && pre.next.val == val){
                pre.next = pre.next.next;
            }
            pre = pre.next;
            if(pre == null) return start.next;
        }
        return start.next;
    }
}