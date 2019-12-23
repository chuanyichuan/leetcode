package cc.kevinlu.leetcode.cc;

public class MainTest191 {

    public static void main(String[] args) {
        int n = 16777215;
        int bitCount = 0;
        while (n != 0) {
            bitCount++;
            n &= (n - 1);
        }
        System.out.println(bitCount);
    }

}
