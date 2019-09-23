package cc.kevinlu.leetcode.cc;

public class MainTest191 {

    public static void main(String[] args) {
        int n = 16777215;
        int bitCount = 0;
        while (n != 0) {
            bitCount++;
            System.out.printf("%d & %d = ", n, n - 1);
            n &= (n - 1);
            System.out.println(n);
        }
        System.out.println();
        System.out.println(bitCount);
    }

}
