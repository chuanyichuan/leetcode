package cc.kevinlu.leetcode;

public class MainTest058 {
    public static void main(String[] args) {
        String s = "I am a boy  ";
        System.out.println(lengthOfLastWord02(s));
    }

    /**
     * 使用java内置方法
     */
    public static int lengthOfLastWord01(String s) {
        String sl = s.trim();
        String[] str = sl.split(" ");
        String res = str[str.length - 1];
        return res.length();
    }

    public static int lengthOfLastWord02(String s) {
        int i = s.length() - 1;
        int result = 0;
        while (i > -1 && s.charAt(i) == ' ') {
            i--;
        }
        if (i == -1) {
            return 0;
        } else {
            while (i > -1 && s.charAt(i) != ' ') {
                result++;
                i--;
            }
        }
        return result;
    }
}
