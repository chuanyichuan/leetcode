package cc.kevinlu.leetcode;

public class MainTest771 {

    public static void main(String[] args) {
        String j = "z";
        String s = "ZZ";
        System.out.println(numJewelsInStones(j, s));
    }

    public static int numJewelsInStones(String J, String S) {
        char[] sc = S.toCharArray();
        int count = 0;
        for (int i = 0, size = sc.length; i < size; i++) {
            if (J.contains(String.valueOf(sc[i]))) {
                count++;
            }
        }
        return count;
    }

}
