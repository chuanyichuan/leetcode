package cc.leetcode.cc;

/**
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class MainTest203 {

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        int val = 6;

        removeElements(node0, val);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode ln = new ListNode(0);
        ListNode cur = head, lastNode = ln;
        while (cur != null) {
            if (cur.val != val) {
                lastNode.next = new ListNode(cur.val);
                lastNode = lastNode.next;
            }
            cur = (cur.next != null) ? cur.next : null;
        }
        return ln.next;

    }

    public static class ListNode {
        int      val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
