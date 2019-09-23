package cc.kevinlu.leetcode.cc;

public class MainTest389 {

    public static void main(String[] args) {
        String s = "a", t = "aa";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int[] chArray = new int[200];
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        for (char cs : chs) {
            chArray[cs] = chArray[cs] + 1;
        }
        for (char ct : cht) {
            if (chArray[ct] == 0) {
                return ct;
            } else {
                chArray[ct] = chArray[ct] - 1;
            }
        }
        return '\n';
    }

}
