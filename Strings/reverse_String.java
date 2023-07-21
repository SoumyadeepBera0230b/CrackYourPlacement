package Strings;

public class reverse_String {
    public static void main(String[] args) {
        String s = " this   is good ";
        String res = reverseString(s);
        System.out.println(res);
    }

    public static String reverseString(String strs) {
        String arr[] = strs.strip().split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String joined_str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                joined_str += arr[i];
                if (i < arr.length - 1) {
                    joined_str += " ";
                }
            }
        }
        System.out.println(joined_str.length());
        return joined_str;
    }
}