package cc.kevinlu.leetcode;

public class MainTest143 {
    public static void main(String[] args) {
        int i = Integer.parseInt("3.3");
        System.out.println(i);
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        head.next = listNode2;
        head.next.next = listNode3;
        head.next.next.next = listNode4;
        head.next.next.next.next = listNode5;
        head.next.next.next.next.next = listNode6;
        reorderList(head);

    }
    public static void reorderList(ListNode head) {
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        //反转后一半链表
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        for(int i = 1; i <= length / 2; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for(int j = length / 2 + 1; j < length; j++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        ListNode reserveHead = pre.next;
        pre.next = null;
        head = connect(start.next, reserveHead);
        System.out.println();
    }
    public static ListNode connect(ListNode head, ListNode middle){
        if(head == null && middle == null){
            return null;
        }
        if(head == null && middle != null){
            return middle;
        }
        middle.next = connect(head.next, middle.next);
        head.next = middle;
        return head;
    }

}