package cc.kevinlu.leetcode.cc;

public class MainTest125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //        String s = "race a car";
        System.out.println(isPalindrome(s.toLowerCase()));
        //        System.out.println('a');
        //        System.out.println('z');
        //        System.out.println('A');
        //        System.out.println('Z');
        //        System.out.println('0');
        //        System.out.println('9');
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!isLegal(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isLegal(s.charAt(right))) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isLegal(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

}
