package cc.kevinlu.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

public class MainTest067 {
    public static void main(String[] args) {
        String a = "1011";
        String b = "11";
        System.out.println(addBinary(a,b));

    }

    public static String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();
        int len = a.length() > b.length() ? a.length() : b.length();
        int[] numa = new int[len];
        int[] numb = new int[len];
        int r = 0, q = 0, carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            numa[r] = Integer.valueOf(a.substring(i, i + 1));
            r++;
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            numb[q] = Integer.valueOf(b.substring(i, i + 1));
            q++;
        }
        for (int n = 0; n < len; n++){
            int sub = carry + numa[n] + numb[n];
            if(sub >= 2){
                carry = 1;
                result.append(sub%2);
            }else{
                carry = 0;
                result.append(sub);
            }
        }
        if(carry == 1) result.append(1);
        String res = result.reverse().toString();
        return  res;
    }
}
