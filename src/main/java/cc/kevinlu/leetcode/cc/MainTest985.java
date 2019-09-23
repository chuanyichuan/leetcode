package cc.kevinlu.leetcode.cc;

import java.util.Arrays;

public class MainTest985 {

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
        int[] r = sumEvenAfterQueries(A, queries);
        Arrays.stream(r).forEach(v -> System.out.println(v));
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] r = new int[A.length];
        int sum = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        System.out.println("sum = " + sum);
        for (int i = 0; i < queries.length; i++) {
            int tmp = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            if (tmp % 2 == 0 && A[queries[i][1]] % 2 != 0) {
                sum -= tmp;
            } else if (tmp % 2 != 0 && A[queries[i][1]] % 2 == 0) {
                sum += A[queries[i][1]];
            } else if (A[queries[i][1]] % 2 == 0) {
                sum += queries[i][0];
            }
            r[i] = sum;
        }
        return r;
    }

}
