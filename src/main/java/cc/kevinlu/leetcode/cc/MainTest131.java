package cc.kevinlu.leetcode.cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest131 {

    public static void main(String[] args) {
        String s = "cdd";
        List<List<String>> result = partition(s);
        System.out.println(result);
    }

    public static int i = 0;

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        StringBuffer revertStr = new StringBuffer();
        for (int i = 1; i <= s.length(); i++) {
            revertStr.insert(0, s.charAt(i - 1));
            List<String> list = new ArrayList<>();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < s.length();) {
                if (j + i > s.length()) {
                    String last = s.substring(j, s.length());
                    if (is(last)) {
                        sb = sb.append(last);
                        list.add(last);
                    }
                    break;
                }
                String str = s.substring(j, j + i);
                if (is(str)) {
                    sb = sb.append(str);
                    list.add(str);
                }
                j = j + i;
            }
            if (s.equalsIgnoreCase(sb.toString())) {
                result.add(list);
            }
        }

        if (i == 0) {
            ++i;
            List<List<String>> s12 = partition(revertStr.toString());
            if (s12 != null && s12.size() > 0) {
                for (List<String> sl : s12) {
                    Collections.reverse(sl);
                    if (!result.contains(sl)) {
                        result.add(sl);
                    }
                }
            }
        }

        return result;
    }

    private static boolean is(String s) {
        if (s.length() == 1) {
            return true;
        }
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
