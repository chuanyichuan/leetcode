package cc.kevinlu.leetcode;

import java.util.HashSet;

public class MainTest142 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10111", 2));
    }
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(hashSet.contains(curr)){
                return curr;
            }
            hashSet.add(curr);
            curr = curr.next;
        }
        return null;
    }
}