package cc.kevinlu.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class MainTest496 {

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
        int[] res = nextGreaterElement(nums1, nums2);
        Arrays.stream(res).boxed().forEach(v -> System.out.print(v + ", "));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int len = nums2.length;
        List<Integer> ll = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            Iterator<Integer> it = ll.iterator();
            while (it.hasNext()) {
                int next = it.next();
                if (nums2[i] > next) {
                    map.put(next, nums2[i]);
                    it.remove();
                }
            }
            ll.add(0, nums2[i]);
        }
        for (int i = 0, size = nums1.length; i < size; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int len = nums2.length;
        Stack<Integer> stack = new Stack<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for (int i = 0, size = nums1.length; i < size; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int len = nums2.length;
        List<Integer> list = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        // key: 数字, value: 位置
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0, size = nums1.length; i < size; i++) {
            int index = map.get(nums1[i]);// 位置
            if (index == len - 1) {
                res[i] = -1;
            }

            boolean r = false;
            int j = index + 1;
            for (; j < len; j++) {
                if (nums1[i] < nums2[j]) {
                    r = true;
                    break;
                }
            }
            if (r) {
                res[i] = nums2[j];
            } else {
                res[i] = -1;
            }
        }

        return res;
    }

}
