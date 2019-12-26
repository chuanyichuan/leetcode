package cc.kevinlu.leetcode;

public class MainTest092 {
    public static void main(String[] args) {

    }

    /**
     * 反转链表的另一种思路
     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        for(int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for(int j = m; j < n; j++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return start.next;
    }
}