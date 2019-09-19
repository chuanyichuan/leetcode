package cc.kevinlu.leetcode;

import java.util.Arrays;

public class MainTest942 {

    public static void main(String[] args) {
        int[] r = diStringMatch("DDI");
        Arrays.stream(r).forEach(v -> System.out.println(v));
    }

    public static int[] diStringMatch(String S) {
        int maxN = S.length();
        int[] result = new int[maxN + 1];
        int i = 0;
        for (int j = maxN, k = 0; k < maxN; k++) {
            if (S.charAt(k) == 'I') {
                result[k] = i;
                i++;
            } else {
                result[k] = j;
                j--;
            }
        }
        result[maxN] = i;
        return result;
    }

}
