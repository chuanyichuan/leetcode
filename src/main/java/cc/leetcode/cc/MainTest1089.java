package cc.leetcode.cc;

import java.util.Arrays;

/**
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * 示例 2：
 *
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/duplicate-zeros
 */
public class MainTest1089 {

    public static void main(String[] args) {
        //        int[] arr = { 1, 5, 2, 0, 6, 8, 0, 6, 0 };
        int[] arr = { 1, 0, 2, 3, 0, 0, 5, 0 };
        duplicateZeros(arr);
        Arrays.stream(arr).forEach(v -> System.out.print(v + ","));
    }

    public static void duplicateZeros(int[] arr) {
        int maxIndex = 0, sIndex = 0;
        for (int a : arr) {
            if (maxIndex >= arr.length) {
                break;
            }
            if (a == 0) {
                ++maxIndex;
            }
            maxIndex++;
            sIndex++;
        }
        int i = arr.length - 1;
        if (arr[sIndex - 1] == 0) {
            arr[i] = 0;
            i--;
            sIndex--;
            if (maxIndex == arr.length) {
                arr[i] = 0;
                i--;
            }
        }
        for (; i >= 0; i--) {
            arr[i] = arr[sIndex - 1];
            if (arr[sIndex - 1] == 0) {
                arr[--i] = 0;
            }
            sIndex--;
        }
    }

}
