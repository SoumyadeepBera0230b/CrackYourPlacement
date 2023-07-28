// Given a string S consisting of lowercase Latin Letters. Return the first
// non-repeating character in S. If there is no non-repeating character, return
// '$'.

// s = "hell0" output: "h" because it is the first term that occurs only ones other than e, 0

import java.util.Arrays;

public class Non_Repeating_Character {
    public static void main(String[] args) {

        String s = "a good   example";
        String arr[] = s.strip().split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        String joined = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                joined += arr[i];
                if (i != arr.length - 1)
                    joined += " ";
            }
        }
        System.out.println(joined);
        // char res = non_Repeating_char(s);
        // System.out.println(res);
    }

    public static char non_Repeating_char(String s) {

        int cnt_char[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt_char[(int) s.charAt(i) - 97] += 1;
        }
        System.out.println(Arrays.toString(cnt_char));

        for (int i = 0; i < s.length(); i++) {
            if (cnt_char[(int) s.charAt(i) - 97] == 1) {
                return s.charAt(i);
            }
        }

        return '$';
    }
}