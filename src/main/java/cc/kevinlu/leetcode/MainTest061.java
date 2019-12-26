package cc.kevinlu.leetcode;

public class MainTest061 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
       /* ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        head.next = listNode2;
        head.next.next = listNode3;
        head.next.next.next = listNode4;
        head.next.next.next.next = listNode5;*/
        //System.out.println(5 % 1);
        //rotateRight(head, 2);
        String s = Integer.toBinaryString(4);
        int i = Integer.parseInt("1010", 2);
        System.out.println(i);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        if(length == 1) {
            return head;
        }
        k = k % length;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        for(int i = 0; i < length - k; i++) {
            pre = pre.next;
        }
        head = pre.next;
        ListNode temp = head;
        if(temp != null){
            while(temp.next != null){
                temp = temp.next;
            }
            pre.next = null;
            temp.next = start.next;
            return head;
        }else {
         return start.next;
        }

    }

    public ListNode rotateRight1(ListNode head, int k) {
        //翻转后K个节点
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        for(int i = 0; i < length - k; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for(int j = length - k + 1; j < length; j++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        ListNode newHead = pre.next;
        pre.next = null;
        head.next = start.next;
        return newHead;
    }
}