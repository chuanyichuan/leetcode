package cc.kevinlu.leetcode;

public class MainTest021 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        //ListNode listNode3 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        //listNode2.next = listNode3;

        ListNode listNodeA = new ListNode(1);
        ListNode listNodeB = new ListNode(3);
        ListNode listNodeC = new ListNode(4);
        listNodeA.next = listNodeB;
        listNodeB.next = listNodeC;
        mergeTwoLists(listNode,listNodeA);

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode currPev = new ListNode(-1);
      ListNode curr = currPev;
      while(l1!=null&&l2!=null){
          if(l1.val<=l2.val){
              curr.next = l1;
              curr = curr.next;
              l1 = l1.next;
          }else {
              curr.next = l2;
              curr = curr.next;
              l2 = l2.next;
          }
      }
      curr.next = l1==null?l2:l1;
      return currPev.next;
    }
}
