package cc.kevinlu.leetcode;

public class MainTest306 {
    public static void main(String[] args) {
        String num = "1123588";
        System.out.println(isAdditiveNumber(num));

    }
    public static boolean isAdditiveNumber(String num) {
        if(num.length()<4)return false;
        for(int i=0;i<num.length()-2;){
            String str = num.substring(i,i+1);
            String stc = num.substring(i+1,i+2);
            String sub = num.substring(i+2,i+3);
            int a=Integer.valueOf(str);
            int b= Integer.valueOf(stc);
            int c= Integer.valueOf(sub);
            if (c==a+b){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
