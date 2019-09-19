package cc.kevinlu.leetcode;

public class MainTest258 {

    public static void main(String[] args) {
        System.out.println(addDigits(13));
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        num = addDigits(sum);
        return num;
    }
}
