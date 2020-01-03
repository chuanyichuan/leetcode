package cc.leetcode.cc;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给你两个数组，arr1 和 arr2，
 *
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 *
 *  
 *
 * 示例：
 *
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 *  
 *
 * 提示：
 *
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * arr2 中的元素 arr2[i] 各不相同
 * arr2 中的每个元素 arr2[i] 都出现在 arr1 中
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-sort-array
 */
public class MainTest1122 {

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] r = relativeSortArray(arr1, arr2);
        Arrays.stream(r).boxed().forEach(v -> System.out.print(v + ", "));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] r = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list2 = new ArrayList<>();
        HashSet hs = new HashSet();
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            if (!hs.contains(arr1[i])) {
                list2.add(arr1[i]);
            }
        }

        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int size = map.get(arr2[i]);
            for (int j = 0; j < size; j++) {
                r[k] = arr2[i];
                k++;
            }
        }
        Collections.sort(list2);
        for (Integer item : list2) {
            r[k] = item;
            k++;
        }
        return r;
    }

    public static int[] relativeSortArray1(int[] arr1, int[] arr2) {
        int[] r = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        int k = 0;
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list = Arrays.stream(arr1).boxed().filter(v -> !list2.contains(v)).sorted()
                .collect(Collectors.toList());

        // 已经存在的数字填充,并且数字从arr1中全部删除
        for (int i = 0; i < arr2.length; i++) {
            int size = map.get(arr2[i]);
            for (int j = 0; j < size; j++) {
                r[k] = arr2[i];
                k++;
            }
        }
        for (Integer item : list) {
            r[k] = item;
            k++;
        }

        return r;
    }

}
