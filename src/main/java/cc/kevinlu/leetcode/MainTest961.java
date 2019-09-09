package cc.kevinlu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MainTest961 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        repeatedNTimes(nums);
    }

    public static int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                return i;
            }
            map.put(i, i);
        }
        return 0;
    }

}
