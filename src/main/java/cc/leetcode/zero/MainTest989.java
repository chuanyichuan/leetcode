package cc.leetcode.zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zero
 * @date 2020/1/8 10:18 下午
 */
public class MainTest989 {

    public static void main(String[] args) {
        int[] nums = {0};
        int k = 1000;
        System.out.println(addToArrayForm(nums, k).toString());
    }

    /**
     * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
     * <p>
     * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：A = [1,2,0,0], K = 34
     * 输出：[1,2,3,4]
     * 解释：1200 + 34 = 1234
     * 示例 2：
     * <p>
     * 输入：A = [2,7,4], K = 181
     * 输出：[4,5,5]
     * 解释：274 + 181 = 455
     * 示例 3：
     * <p>
     * 输入：A = [2,1,5], K = 806
     * 输出：[1,0,2,1]
     * 解释：215 + 806 = 1021
     * 示例 4：
     * <p>
     * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
     * 输出：[1,0,0,0,0,0,0,0,0,0,0]
     * 解释：9999999999 + 1 = 10000000000
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-to-array-form-of-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    private static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int i = A.length -1;
        int temp = K;
        while (i >= 0) {
            temp  += A[i];
            if (temp > 9) {
                result.add(0, temp % 10);
            }else {
                result.add(0, temp);
            }
            temp = temp / 10;
            i--;
        }
        if (temp > 9) {
            while (temp > 9) {
                result.add(0, temp % 10);
                temp /= 10;
            }
        }
        if (temp > 0) {
            result.add(0, temp);
        }

        return result;
    }
}
