package cc.kevinlu.leetcode;

import java.util.HashMap;

public class MainTest012 {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
    public static String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roma = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i<nums.length; i++){
            int sub =  num/nums[i];
            if (sub == 0)continue;
            for(int j = sub ; j>0; j--){
                stringBuffer.append(roma[i]);
            }
            num = num -nums[i]*sub;
        }
        return stringBuffer.toString();
    }
}
