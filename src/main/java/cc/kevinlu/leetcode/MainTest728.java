package cc.kevinlu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MainTest728 {

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 10000);
        list.stream().forEach(v -> System.out.println(v));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        String s;
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            s = String.valueOf(i);
            if (s.contains("0")) {
                continue;
            }
            char[] c = s.toCharArray();
            int d = 0;
            boolean r = true;
            while (d < c.length) {
                if (i % Character.getNumericValue(c[d]) != 0) {
                    r = false;
                    break;
                }
                d++;
            }
            if (r) {
                result.add(i);
            }
        }
        return result;
    }

}
