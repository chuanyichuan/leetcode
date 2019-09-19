package cc.kevinlu.leetcode;

public class MainTest476 {

    public static void main(String[] args) {
        System.out.println(findComplement(12));
    }

    public static int findComplement(int num) {
        int temp = num, c = 0;
        while (temp > 0) {
            temp >>= 1;
            c = (c << 1) + 1;
            System.out.println(temp);
            System.out.println(c);
            System.out.println("----");
        }
        return num ^ c;
    }

}
