package Strings;

import java.util.*;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);

        String s1 = s[0];
        String s2 = s[s.length - 1];

        int i = 0;
        String res = "";

        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res += s1.charAt(i);
                i += 1;
            } else
                break;
        }
        return res;
    }
}
