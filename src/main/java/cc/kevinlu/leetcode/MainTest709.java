package cc.kevinlu.leetcode;

public class MainTest709 {

    public static void main(String[] args) {
        System.out.println(toLowerCase("AbCbDdeE"));
    }

    public static String toLowerCase(String str) {
        char[] chs = str.toCharArray();
        for (int i = 0, size = chs.length; i < size; i++) {
            if (chs[i] >= 65 && chs[i] <= 90) {
                chs[i] = (char) (chs[i] + 32);
            }
        }
        return new String(chs);
    }

}
