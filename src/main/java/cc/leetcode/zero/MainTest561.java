package cc.leetcode.zero;

/**
 * @author zero
 * @date 2020/1/9 5:05 下午
 */
public class MainTest561 {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }
    /**
     * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
     *
     * 示例 1:
     *
     * 输入: [1,4,3,2]
     *
     * 输出: 4
     * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/array-partition-i
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    private static int arrayPairSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (value < nums[j]) {
                    nums[j + 1] = nums[j];
                }else {
                    break;
                }
            }
            nums[j+1] = value;
        }
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }
        return result;
    }
}
