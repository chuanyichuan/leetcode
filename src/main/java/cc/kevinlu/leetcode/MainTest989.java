package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest989 {

    public static void main(String[] args) {
        int[] A = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        int K = 516;

        System.out.println(addToArrayForm(A, K));
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        if (A.length == 1 && (A[0] + K) < 10) {
            list.add(A[0] + K);
            return list;
        }
        long numa = 0;
        for (int i = 0; i < A.length; i++) {
            numa = numa * 10 + A[i];
        }
        long sum = numa + K;
        while (sum > 0) {
            list.add(0, (int) (sum % 10));
            sum = sum / 10;
        }
        return list;
    }

}
