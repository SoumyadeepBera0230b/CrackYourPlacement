package Strings;

public class ValidParindrome {
    public static void main(String[] args) {
        String s = "abcdecba";
        boolean res = valid_palindrome(s);
        System.out.println(res);
    }

    public static boolean valid_palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                boolean res = is_palindrome(s, i + 1, j) || is_palindrome(s, i, j - 1);
                return res;
            }
        }
        return true;
    }

    public static boolean is_palindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
