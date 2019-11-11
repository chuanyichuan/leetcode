package cc.kevinlu.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainTest003 {
    public static void main(String[] args) {
        String s = "abcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                queue.offer(s.charAt(i));
            } else {
                    if (result <= queue.size()) result = queue.size();
                    while (queue.element() != s.charAt(i)) queue.poll();
                    queue.poll();
                    queue.offer(s.charAt(i));
                }
            }
        return result > queue.size() ? result : queue.size();
    }
}
