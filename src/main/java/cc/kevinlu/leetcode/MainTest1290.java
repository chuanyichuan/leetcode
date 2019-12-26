package cc.kevinlu.leetcode;

public class MainTest1290 {
    public static void main(String[] args) {

    }
    public int getDecimalValue(ListNode head) {
        String ans = "";
        while(head != null){
            ans += head.val;
            head = head.next;
        }
        return Integer.parseInt(ans, 2);
    }
}